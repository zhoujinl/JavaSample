package com.jalon.springsample.ioc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JinQiu on 2018/4/22.
 * 输出结果：
     BeforeInitialization : helloWorld
     HelloWorldLifeCycle Bean is going through init.
     AfterInitialization : helloWorld
     Your Message : Hello World!
     HelloWorldLifeCycle Bean will destroy now.
 */
public class HelloWorldPostProcessorDemo {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        HelloWorldLifeCycle obj = (HelloWorldLifeCycle) context.getBean("helloWorld2");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
