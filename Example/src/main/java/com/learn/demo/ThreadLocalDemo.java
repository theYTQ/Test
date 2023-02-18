package com.learn.demo;

public class ThreadLocalDemo {
    //父子线程共享
    private static InheritableThreadLocal<String> itl = new InheritableThreadLocal<String>();

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "......线程执行......");
        itl.set("A");
        System.out.println("父线程：main线程赋值：A.......");
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "......线程执行......");
            System.out.println("子线程：T1线程读值：" + itl.get());
        }, "T1").start();
        System.out.println("执行结束......");
    }
}
