package com.study.javaex;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadEx21 {
    public static void main(String[]args){
        Runnable r = new RunnableEx21();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account {
    private int balance = 1000;

//    private AtomicInteger value = new AtomicInteger(1000);

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= money;

//            value.addAndGet(1);
        }
    }
}

class RunnableEx21 implements Runnable{
    Account acc = new Account();

    public void run(){
        while (acc.getBalance()>0){
            int money = (int)(Math.random()*3 +1 )* 100;
            acc.withdraw(money);
            System.out.println("balance:"+acc.getBalance());
        }
    }
}