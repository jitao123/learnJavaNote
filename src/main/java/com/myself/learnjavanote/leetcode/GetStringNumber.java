package com.myself.learnjavanote.leetcode;

import org.springframework.util.ObjectUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: AT
 * @Date: 2021/3/16 10:32 上午
 */
public class GetStringNumber {

    public static void main(String[] args) {

        String str = "fasdfaerwefadczdsgeavc";

        Map<Character, Integer> hashMap = new HashMap<>();

        char[] chars = str.toCharArray();

        for (char aChar : chars) {
            if (!hashMap.containsKey(aChar)) {
                hashMap.put(aChar, 1);
            } else {
                hashMap.put(aChar, hashMap.get(aChar) + 1);
            }
        }


        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hashMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });


        for (Map.Entry<Character, Integer> entry : list) {
            System.out.println("~~~ "+entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("！！@#！@#！@测试版本～！@！@～！@～1");
    }

}
