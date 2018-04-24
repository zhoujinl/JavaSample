package com.jalon.mybatis.entity;

/**
 * Created by Jalon on 17/04/2018.
 *  用到内部关联和外部关联
 */
public class Pod {
    // AUTO_INCREMENT
    private int id;
    private String name;
    private Book book;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Book getBook() {return book;}

    public void setBook(Book book) {this.book = book; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Pod{" +
                "id=" + id +
                ", name=" + name +
                ", book.name='" + book.getName() + '\'' +
                ", book.price=" + book.getPrice() +
                '}';
    }
}
