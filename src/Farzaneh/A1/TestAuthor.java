package Farzaneh.A1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author01 = new Author("abc", "abc@abc.com", 'm', "instagram.com/author");
        System.out.println("the name is: " + author01.getName());
        System.out.println("the email is: " + author01.getEmail());
        System.out.println("the gender is: " + author01.getGender());
        System.out.println("the instagram is: " + author01.getInstagram());
        System.out.println(author01.toString());

    }
}
