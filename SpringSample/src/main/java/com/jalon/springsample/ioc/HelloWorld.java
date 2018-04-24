package com.jalon.springsample.ioc;

/**
 * Created by JinQiu on 2018/4/21.
 */
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("HelloWorld Your Message : " + message);
    }

    public void init(){
        System.out.println("HelloWorld Bean is going through init.");
    }
}
