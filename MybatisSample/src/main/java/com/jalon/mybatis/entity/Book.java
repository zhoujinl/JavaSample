package com.jalon.mybatis.entity;

/**
 * Created by Jalon on 17/04/2018.
 * 将使用注解
 */
public class Book {
    // AUTO_INCREMENT
    private int id;
    private String name;
    private int price;

    public int getPrice() {return price;}

    public void setPrice(int price) { this.price = price;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
