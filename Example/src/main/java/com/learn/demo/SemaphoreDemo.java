package com.learn.demo;

import java.util.concurrent.*;

public class SemaphoreDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4 * 2, 40, 30, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1024 * 10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        final Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 100; i++) {
            final int serial = i;
            threadPoolExecutor.execute(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "线程成功获取许可！请求序号：" + serial);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            });
        }
        threadPoolExecutor.shutdown();
    }
}
