package com.myself.learnjavanote.javabeanlearn;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: AT
 * @Date: 2021/3/2 11:20 上午
 */
@Component
public class SpringNameAware implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    private String beanName;

    @Override
    public void setBeanName(String s) {
        this.beanName=s;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanFactory~~~~~~~"+beanFactory.toString());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext~~~~~~~"+applicationContext.toString());
    }
}
