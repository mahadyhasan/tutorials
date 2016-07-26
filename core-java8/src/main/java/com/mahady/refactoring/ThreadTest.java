package com.mahady.refactoring;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Mahady Hasan on 23/07/16.
 */
public class ThreadTest {
    public static void main(String[] args) {
        final ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> System.out.println("Hello from " + Thread.currentThread().getName()));
    }
}
