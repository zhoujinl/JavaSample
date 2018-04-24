package com.jalon.springsample.aop;

import com.jalon.springsample.aop.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JinQiu on 2018/4/22.
 */
public class MainApp {
    public static void main(String[] args) {
        byAspAnnotation();
        //byXml();
    }

    private static void byAspAnnotation() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop-asp.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        //student.printThrowException();
    }

    private static void byXml() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        //student.printThrowException();

    }
}
