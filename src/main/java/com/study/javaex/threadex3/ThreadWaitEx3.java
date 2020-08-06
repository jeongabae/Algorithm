package com.study.javaex.threadex3;

import java.util.ArrayList;
import java.util.List;

public class ThreadWaitEx3 {

    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        Thread.sleep(2000);
        System.exit(0);
    }
}

class Customer implements Runnable{

    private final Table table;
    private final String food;

    public Customer(Table table, String food){
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            String name = Thread.currentThread().getName();

            table.remove(food);
            System.out.println(name +  " ate a " + food);
        }
    }
}

class Cook implements Runnable{
    private final Table table;


    public Cook(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while(true) {
            int idx = (int)(Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Table {
    String[] dishNames = {"donut","donut","burger"};
    final int MAX_FOOD = 6;

    private List<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        while (dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting ... ");

            try {
                wait();
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        dishes.add(dish);
        notify();
        System.out.println("Dishes : " + dishes.toString());
    }

    public void remove(String dishName) {
        synchronized (this) {
            String name = Thread.currentThread().getName();

            while(dishes.size() == 0) {
                System.out.println(name + " is waiting ... ");
                try {
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

            while(true) {
                for(int i = 0 ; i < dishes.size(); i++) {
                    if(dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify();

                        return;
                    }
                }
                System.out.println(name + " is waiting ... ");
                try {
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

        }
    }

    public int dishNum() {
        return dishNames.length;
    }
}