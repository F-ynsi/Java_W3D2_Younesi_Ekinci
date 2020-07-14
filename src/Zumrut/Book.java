package Zumrut;

import java.util.Arrays;

public class Book {
    String name;
    Author[] author;
    double preis;
    int quantity;

    public Book(String name, Author[] author, double preis) {
        this.name = name;
        this.author = author;
        this.preis = preis;
    }

    public Book(String name, Author[] author, double preis, int quantity) {
        this.name = name;
        this.author = author;
        this.preis = preis;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + Arrays.toString(author) +
                ", preis=" + preis +
                ", quantity=" + quantity +
                '}';
    }
}
