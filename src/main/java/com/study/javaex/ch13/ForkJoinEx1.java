package com.study.javaex.ch13;

import java.util.concurrent.*;
public class ForkJoinEx1 {
    static final ForkJoinPool pool = new ForkJoinPool();

    public static void main(String[]args){
        long from = 1L, to = 100_000_000L;

        SumTask task = new SumTask(from, to);

        long start = System.currentTimeMillis(); //시작시간 초기화
        Long result = pool.invoke(task);
        System.out.println("Elapsedtime(4 core):"+(System.currentTimeMillis()-start));

        System.out.printf("sum pf $d~%d = %d%n", from, to , result);
        System.out.println();

        result = 0L;
        start = System.currentTimeMillis();
        for(long i= from;i<=to;i++){
            result += i;
        }
        System.out.println("Elapsedtime(1 core):"+(System.currentTimeMillis()-start));
        System.out.printf("sum pf $d~%d = %d%n", from, to , result);

    }
}

class SumTask extends RecursiveTask<Long>{
    long from, to;
    SumTask(long from, long to){
        this.from = from;
        this.to = to;
    }
    public Long compute(){
        long size = to - from +1;

        if(size <=5)
            return sum();

        long half = (from+to)/2;

        SumTask leftSum = new SumTask(from, half);
        SumTask rightSum = new SumTask(half+1, half);

        leftSum.fork();

        return rightSum.compute() + leftSum.join();

    }
    long sum(){
        long tmp = 0L;

        for(long i=from;i<=to;i++)
            tmp += i;
        return tmp;
    }
}
