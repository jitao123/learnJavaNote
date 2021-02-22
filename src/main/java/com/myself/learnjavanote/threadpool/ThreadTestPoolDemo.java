package com.myself.learnjavanote.threadpool;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;


/**
 * @description:
 * @author: AT
 * @Date: 2021/2/20 4:02 下午
 */
public class ThreadTestPoolDemo {
    public static void main(String[] args) throws Exception {

        long startTime = System.currentTimeMillis();

//        ExecutorService executorService = Executors.newCachedThreadPool(); // 运行速度最快
//        ExecutorService executorService = Executors.newFixedThreadPool(10); // 较慢
//        ExecutorService executorService = Executors.newSingleThreadExecutor();// 慢

        // 自定义线程池 ，初始核心员工容量为10，非核心员工10，自定义队列长度为10
        ThreadPoolExecutor executorService = new ThreadPoolExecutor(10,
                20,
                0L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(10));

        for (int i = 1; i < 40; i++) {
            executorService.execute(new ThreadTest(i));
        }

        System.out.println("共计时间～～～" + (System.currentTimeMillis() - startTime));
    }
}
