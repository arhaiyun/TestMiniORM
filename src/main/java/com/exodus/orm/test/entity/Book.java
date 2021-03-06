package com.exodus.orm.test.entity;

import com.exodus.orm.annotation.ORMColumn;
import com.exodus.orm.annotation.ORMId;
import com.exodus.orm.annotation.ORMTable;

/**
 * @author arhaiyun
 * @version 1.0
 * @date 2020/5/11 16:58
 */
@ORMTable(name = "book")
public class Book {
    @ORMId
    @ORMColumn(name = "bid")
    private String id;

    @ORMColumn(name = "bname")
    private String name;

    @ORMColumn(name = "author")
    private String author;

    @ORMColumn(name = "price")
    private Double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
