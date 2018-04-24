package com.jalon.springsample.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by JinQiu on 2018/4/22.
 */
public class MainApp {
    public static void main(String[] args) {
        //jdbc();
        procedure();
    }
    private static void procedure(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("jdbc.xml");
        StudentJDBCTemplateByProcedure studentJDBCTemplate =
                (StudentJDBCTemplateByProcedure)context.getBean("studentJDBCTemplateByProcedure");

        Student student = studentJDBCTemplate.getStudent(6);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
    }
    private static void jdbc() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("jdbc.xml");
        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        System.out.println("------Records Creation--------" );
        studentJDBCTemplate.create("Zara", 11);
        studentJDBCTemplate.create("Nuha", 2);
        studentJDBCTemplate.create("Ayan", 15);
        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.listStudents();
        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }
        System.out.println("----Updating Record with ID = 2 -----" );
        studentJDBCTemplate.update(2, 20);
        System.out.println("----Listing Record with ID = 3 -----" );
        Student student = studentJDBCTemplate.getStudent(3);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
    }
}
