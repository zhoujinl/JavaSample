package com.jalon.springsample.di;

/**
 * Created by JinQiu on 2018/4/22.
 */
public class SpellChecker {
    private int num = 0;
    public SpellChecker(){
        System.out.println("Inside SpellChecker constructor." );
    }
    public SpellChecker(int num,String str){
        this.num = num;
        System.out.println("Inside SpellChecker constructor." + num + str);
    }

    public void setNum(int num){
        this.num = num;
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling num is "+this.num );
    }
}
