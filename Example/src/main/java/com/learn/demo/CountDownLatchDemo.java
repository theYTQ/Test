package com.learn.demo;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        //多等一
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int i = 1; i <= 3; i++) {
            new Thread(() -> {
                try {
                    System.out.println("线程：" + Thread.currentThread().getName() + "......阻塞等待！");
                    countDownLatch.await();
                    System.out.println("线程：" + Thread.currentThread().getName() + "......开始执行！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "T" + i).start();
        }
        Thread.sleep(1000);
        countDownLatch.countDown();

        //一等多
        final CountDownLatch countDownLatch2 = new CountDownLatch(3);
        for (int i = 1; i <= 3; i++) {
            final int page = 1;
            new Thread(() -> {
                System.out.println("线程：" + Thread.currentThread().getName() + "......读取分段数据：" + (page - 1) * 200 + "-" + page * 200 + "行");
                countDownLatch2.countDown();
            }, "T" + i).start();
        }
        countDownLatch2.await();
        System.out.println("线程：" + Thread.currentThread().getName() + "......对数据集：data进行处理");
    }
}
