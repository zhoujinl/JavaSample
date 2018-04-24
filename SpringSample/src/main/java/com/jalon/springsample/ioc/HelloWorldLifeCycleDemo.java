package com.jalon.springsample.ioc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JinQiu on 2018/4/22.
 */
public class HelloWorldLifeCycleDemo {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("ioc.xml");
        HelloWorldLifeCycle obj = (HelloWorldLifeCycle) context.getBean("helloWorldLifeCycle");
        obj.getMessage();
        //注册钩子，默认的销毁函数才会执行
        context.registerShutdownHook();
    }
}
