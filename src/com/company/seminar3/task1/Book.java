package com.company.seminar3.task1;

import java.util.ArrayList;

public class Book {

    private ArrayList<String> author;
    private String title;
    private int ISBN;
    private int price;

    public Book(ArrayList author, String title, int ISBN, int price){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.price = price;

    }

    public ArrayList<String> getAuthor() {
        return author;
    }

    public String getTitle(){
        return title;
    }

    public int getISBN(){
        return ISBN;
    }

    public int getPrice() {
        return price;
    }


}
