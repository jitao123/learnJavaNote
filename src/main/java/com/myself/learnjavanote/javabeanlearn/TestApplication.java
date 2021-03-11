package com.myself.learnjavanote.javabeanlearn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: AT
 * @Date: 2021/3/3 11:01 上午
 */
public class TestApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);// 已类的方式加载配置文件

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class); //  spring 自动填充对象


        UserMapper userMapper1 = new UserMapper(); // 没有填充对象

//        com.myself.learnjavanote.javabeanlearn.UserMapper@163370c2
//        com.myself.learnjavanote.javabeanlearn.UserMapper@1677d1

        System.out.println(userMapper.toString());



        System.out.println(userMapper1.toString());

    }
}
