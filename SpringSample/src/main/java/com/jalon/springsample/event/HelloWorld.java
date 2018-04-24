package com.jalon.springsample.event;

/**
 * Created by JinQiu on 2018/4/22.
 * https://www.w3cschool.cn/wkspring/reap1icq.html
 */
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
