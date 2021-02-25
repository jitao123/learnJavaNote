package com.myself.learnjavanote.threadpool;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: AT
 * @Date: 2021/2/24 11:17 上午
 */
public class JvmLearnTuning {
    private byte[] bytes = new byte[1024 * 200];

    /**
     * 1个方法就是栈帧，这里创建的是无数个方法，
     * 那么就会一直占用栈内存，导致栈溢出
     */
    public void foo(){
        foo();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("hello～～～～");
        List<JvmLearnTuning> list = new ArrayList<>();
        while (true) {
            list.add(new JvmLearnTuning());
            Thread.sleep(10L);
        }
    }
}
