package com.jalon.springsample.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by JinQiu on 2018/4/22.
 *
 * @Autowired 注释可以在 setter 方法中被用于自动连接 bean，就像 @Autowired 注释，容器，一个属性或者任意命名的可能带有多个参数的方法。
 * @Autowired 注释可以用在属性上。当时使用 为自动连接属性传递的时候，Spring 会将这些传递过来的值或者引用自动分配给那些属性。
 * @Autowired 注释可以用在构造函数上
 * 默认情况下，@Autowired 注释意味着依赖是必须的，它类似于 @Required 注释，然而，你可以使用 @Autowired 的 （required=false） 选项关闭默认行为。
 * 最好是放在属性上，set方法都可以省略
 *
 * 与@Resource 对比
 * @Resource ：JDK提供 可以字段和方法，默认是根据 byName。如果没有明确地指定一个 ‘name’，默认名称源于字段名或者 setter 方法。在字段的情况下，它使用的是字段名；在一个 setter 方法情况下，它使用的是 bean 属性名称。
 * @Autowired： Spring提供 可以字段、方法和构造函数，默认是根据byType，所以必要时需要增加Qualifier 增加约束
 *
 */
public class TextEditor {
    //@Autowired
    @Resource
    private SpellChecker spellChecker;

    /* @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }*/

   /* @Autowired
    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }*/

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
