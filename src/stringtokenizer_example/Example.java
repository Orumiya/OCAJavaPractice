package stringtokenizer_example;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Example {
    public static void main(String[] args) {

        StringTokenizer authorTokens = new StringTokenizer(authorList, ",");
        ArrayList<Author> authors = new ArrayList<>();
        System.out.println("authorToken number: " + authorTokens.countTokens());
        while (authorTokens.hasMoreElements()) {
            authors.add(new Author(authorTokens.nextToken()));
        }
        authors.forEach(author -> {
            System.out.println(author.name);
        });
    }

    static String authorList = "Agatha Christie," + "William Shakespeare," +
            "Brandon Hackett," + "Isaac Asimov," + "Ray Bradbury";
}

class Author {
    String name;
    public Author(String name) {
        this.name = name;
    }
}
