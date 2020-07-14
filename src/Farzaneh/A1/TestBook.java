package Farzaneh.A1;

public class TestBook {
    public static void main(String[] args) {
        Author author = new Author("EVA","abc@abc.com",'m',"\"instagram.com/author\"");
        Book book01 = new Book ("Harrypotter", author, 30);
        Book book02 = new Book ("Midnight Sun", author, 40, 10);

        System.out.println(book01.getName());
        System.out.println(book01.getAuthor().getName());
        System.out.println(book02.getName());
        System.out.println(book02.getAuthor().getName());
        book02.authorDetails();

    }
}
