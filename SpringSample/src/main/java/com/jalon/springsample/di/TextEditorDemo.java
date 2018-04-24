package com.jalon.springsample.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JinQiu on 2018/4/22.
 */
public class TextEditorDemo {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("di.xml");
        //构造函数注入
        //TextEditor te = (TextEditor) context.getBean("textEditor");
        //te.spellCheck();

        //设值函数注入1
        //TextEditor te2 = (TextEditor) context.getBean("textEditorBySet");
        //te2.spellCheck();

        //设值函数注入2  使用p
        //TextEditor te3 = (TextEditor) context.getBean("textEditorBySet2");
        //te3.spellCheck();

        //构造函数注入2  使用内部Bean
        TextEditor te4 = (TextEditor) context.getBean("textEditor2");
        te4.spellCheck();
    }
}
