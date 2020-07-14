package Farzaneh.A1;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity;

    ///////////////////////

    public Book (String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    /////////

    public Book (String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    /////////


    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    //////////


    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //////////
    public String getAuthorName() {
        return getAuthor().getName();
    }
    public String getAuthorEmail() {
        return getAuthor().getEmail();
    }
    public char getAuthorGender() {
        return getAuthor().getGender();
    }
    //////////


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    //////////
    public void authorDetails () {
        System.out.println("The author name is: " + author.getName());
        System.out.println("The author email is: " + author.getEmail());
        System.out.println("The author gender is: " + author.getGender());
        System.out.println("The author instagram is: " + author.getInstagram());
    }

}
