package com.myself.learnjavanote.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: AT
 * @Date: 2021/3/17 10:09 上午
 */
public class ThreadPoolTest2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("~~1~~~"+Thread.currentThread().getName());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("~~2~~~"+Thread.currentThread().getName());
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("~~3~~~"+Thread.currentThread().getName());
            }
        });

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(thread);
        executorService.submit(thread2);
        executorService.submit(thread3);


        executorService.shutdown();
    }
}
