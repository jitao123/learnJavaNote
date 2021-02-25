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

    public static void main(String[] args) throws Exception {
        System.out.println("hello～～～～");
        List<JvmLearnTuning> list = new ArrayList<>();
        while (true) {
            list.add(new JvmLearnTuning());
            Thread.sleep(10L);
        }
    }
}
