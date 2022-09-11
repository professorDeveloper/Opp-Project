package Book;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> Book
 * Class Name ->
 * Copyright © : 9/6/2022
 */
public class Book {
    private String name;
    private String author1;
    private int cost;

    public Book(String name, String author, int cost) {
        this.name = name;
        this.author1 = author;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getAuthor1() {
        return author1;
    }

    public int getCost() {
        return cost;
    }
}
