package com.jalon.springsample.di;

/**
 * Created by JinQiu on 2018/4/22.
 */
public class TextEditor {

    private SpellChecker spellChecker;
    public TextEditor() {
        System.out.println("Inside TextEditor constructor null." );
    }
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker setSpellChecker" );
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
