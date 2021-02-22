package com.myself.learnjavanote.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description:
 * @author: AT
 * @Date: 2021/2/20 4:02 下午
 */
public class ThreadTestDemo {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        final Random random = new Random();
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    list.add(random.nextInt());
                }
            };
            thread.start();
            thread.join();
        }
        System.out.println("共计时间～～～" + (System.currentTimeMillis() - startTime));
        System.out.println("list.size()～～～" + list.size());
//        共计时间～～～13425
//        list.size()～～～100000
    }
}
