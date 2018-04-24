package com.jalon.springsample.annotationJava;

/**
 * Created by JinQiu on 2018/4/22.
 */
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

}
