package com.jalon.springsample.ioc;

/**
 * Created by JinQiu on 2018/4/22.
 */
public class HelloWorldLifeCycle {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public void init(){
        System.out.println("HelloWorldLifeCycle Bean is going through init.");
    }
    public void destroy(){
        System.out.println("HelloWorldLifeCycle Bean will destroy now.");
    }
}
