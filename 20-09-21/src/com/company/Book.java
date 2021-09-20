package com.company;

public class Book {

    private String bookName;
    private double price;

    public Book() {
    }

    public Book(String bookName, double price) {
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
    public  void getBook(Book book)
    {
        System.out.println(book);
    }
public void display()
{
    System.out.println("hello");
}
}
