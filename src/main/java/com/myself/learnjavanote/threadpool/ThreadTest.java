package com.myself.learnjavanote.threadpool;

import java.util.List;

/**
 * @description:
 * @author: AT
 * @Date: 2021/2/20 3:41 下午
 */
public class ThreadTest extends Thread {

    public int number;

    public ThreadTest(int number) {
        this.number=number;
    }

    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {

    }

    public static void main(String[] args) {
//        new Thread(new ThreadTest()).run();
//        new Thread(new ThreadTest()).start();
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);
    }
}
