package com.jalon.springsample.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by JinQiu on 2018/4/22.
 * 可以用来加密解密
 *
 */
public class HelloWorldPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String beanName) throws BeansException {
        System.out.println("BeforeInitialization : " + beanName);
        return o;  // you can return any other object as well
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String beanName) throws BeansException {
        System.out.println("AfterInitialization : " + beanName);
        return o;  // you can return any other object as well
    }
}
