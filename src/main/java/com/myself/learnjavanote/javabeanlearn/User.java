package com.myself.learnjavanote.javabeanlearn;

import org.springframework.stereotype.Component;

import java.util.StringJoiner;

/**
 * @description:
 * @author: AT
 * @Date: 2021/3/3 11:13 上午
 */
@Component
public class User {

    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("~!@!~@~!@!~~~~~");
        StringJoiner s2 = new StringJoiner("fasdas");
        StringJoiner merge = stringJoiner.merge(s2);
        System.out.println(merge.toString());

    }
}
