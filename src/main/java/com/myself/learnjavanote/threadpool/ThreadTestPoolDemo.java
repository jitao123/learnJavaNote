package com.myself.learnjavanote.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/**
 * @description:
 * @author: AT
 * @Date: 2021/2/20 4:02 下午
 */
public class ThreadTestPoolDemo {
    public static void main(String[] args) throws Exception {

        long startTime = System.currentTimeMillis();
        final Random random = new Random();
        final List<Integer> list = new ArrayList<>();
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool(); // 运行速度最快
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10); // 较慢
        ExecutorService executorService = Executors.newSingleThreadExecutor();// 慢

        for (int i = 0; i < 1000; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    list.add(random.nextInt());
                }
            });

            executorService.shutdown();
            executorService.awaitTermination(1,TimeUnit.DAYS);
        }
        System.out.println("共计时间～～～" + (System.currentTimeMillis() - startTime));
        System.out.println("list.size()～～～" + list.size());
        int maxValue = Integer.MAX_VALUE;

        System.out.println("list.size()～～～" + maxValue);
    }
}
