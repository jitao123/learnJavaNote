package com.myself.learnjavanote.javabeanlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: AT
 * @Date: 2021/3/3 11:03 上午
 */
@Component
public class UserMapper {

    @Autowired
    private User user;
}
