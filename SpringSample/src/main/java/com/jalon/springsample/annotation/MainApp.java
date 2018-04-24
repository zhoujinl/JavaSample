package com.jalon.springsample.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JinQiu on 2018/4/22.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());


        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();

        ProfileQualifier profile = (ProfileQualifier) context.getBean("profileQualifier");
        profile.printAge();
        profile.printName();

    }
}
