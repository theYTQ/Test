package com.learn.thread;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {
    public static void main(String[] args) {
        CompletableFuture completableFuture = new CompletableFuture();
        completableFuture.supplyAsync(() -> {
            System.out.println("start");
            return "end";
        });
    }
}
