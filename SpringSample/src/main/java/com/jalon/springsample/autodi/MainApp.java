package com.jalon.springsample.autodi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JinQiu on 2018/4/22.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("autodi.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor3");
        te.spellCheck();
    }
}
