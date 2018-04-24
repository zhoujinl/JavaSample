package com.jalon.springsample.autodi;

/**
 * Created by JinQiu on 2018/4/22.
 */
public class TextEditor {
    private SpellChecker spellChecker;  //如果这里换成其他名字，则自动注入失效
    private String name;

    public TextEditor(){}

    public TextEditor( SpellChecker spellChecker, String name ) {
        this.spellChecker = spellChecker;
        this.name = name;
    }

    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
        System.out.println("my name is "+ this.getName());
    }
}

