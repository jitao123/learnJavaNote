package com.myself.learnjavanote.threadpool;

import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.*;

/**
 * @description:
 * @author: AT
 * @Date: 2021/3/16 9:57 上午
 */
public class LearnHashMap {

    public static void main(String[] args) throws Exception {
        ExecutorService ts = Executors.newFixedThreadPool(20);

        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 100; i++) {
            ts.execute(() -> {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String str = Thread.currentThread().getName() + " : " + Integer.toString(12321);
                System.out.println(str);
                countDownLatch.countDown();
            });
        }

        ts.shutdown();

//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//
//
//        for (String keyStr : map.keySet()) {
//            System.out.println(keyStr + ":" + map.get(keyStr));
//        }
    }
}
