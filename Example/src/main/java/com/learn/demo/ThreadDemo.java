package com.learn.demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " run......");
        Thread tA = new Thread(task);
        Thread tB = new Thread(task);
        tA.start();
        tB.start();

        FutureTask<String> futureTask = new FutureTask<>(() ->
            Thread.currentThread().getName() + "-A......");
        new Thread(futureTask, "T1").start();
        System.out.println("main线程获取异步执行结果：" + futureTask.get());
    }
}
