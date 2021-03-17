package com.myself.learnjavanote.threadpool;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @description:
 * @author: AT
 * @Date: 2021/3/17 10:00 上午
 */
public class CountdownLatchTest {
    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newFixedThreadPool(3);
        final CountDownLatch latch = new CountDownLatch(3);
        System.out.println("主线程"+Thread.currentThread().getName()+"等待子线程执行完成...");

        for (int i = 0; i < 3; i++) {
            service.execute(()->{
                try {
                    System.out.println("子线程" + Thread.currentThread().getName() + "开始执行");
                    Thread.sleep((long) (Math.random() * 10000));
                    System.out.println("子线程"+Thread.currentThread().getName()+"执行完成");
                    latch.countDown();//当前线程调用此方法，则计数减一
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        latch.await();//阻塞当前线程，直到计数器的值为0
        System.out.println("主线程"+Thread.currentThread().getName()+"开始执行...");

        service.shutdown();
    }
}