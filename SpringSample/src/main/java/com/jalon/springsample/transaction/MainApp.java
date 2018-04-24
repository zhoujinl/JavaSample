package com.jalon.springsample.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by JinQiu on 2018/4/22.
 */
public class MainApp {
    public static void main(String[] args) {
        //byJava();
        byDeclare();
    }

    //编程式事务管理
    private static void byJava() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("transaction.xml");
        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        System.out.println("------Records creation--------" );
        studentJDBCTemplate.create("Zara", 110, 99, 2010);
        studentJDBCTemplate.create("Nuha", 200, 97, 2010);
        studentJDBCTemplate.create("Ayan", 250, 100, 2011);
        System.out.println("------Listing all the records--------" );
        List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }
    }

    //声明式事务管理
    private static void byDeclare() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("transaction-declare.xml");
        StudentDAO studentJDBCTemplate =
                (StudentDAO)context.getBean("studentJDBCTemplateByAnnotation");
        System.out.println("------Records creation--------" );
        studentJDBCTemplate.create("AZara", 11, 99, 2010);
        studentJDBCTemplate.create("ANuha", 20, 97, 2010);
        studentJDBCTemplate.create("AAyan", 25, 100, 2011);
        System.out.println("------Listing all the records--------" );
        List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }
    }


}
