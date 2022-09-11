package Book;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> Book
 * Class Name -> Main
 * Copyright © : 9/6/2022
 */
public class Main {
    public static void main(String[] args) {
        Bookcase bookcase=new Bookcase(10);
        Book book =new Book("O`tkan kunlar Romani","Abdulla Qodiriy",10000);
        Book book2 =new Book("Aqilli bola Boy bola","Deniel Kornigey",10000);
        Book book3 =new Book("Chol va Dengiz","Ernest Heminguey",10000);
        Book book4 =new Book("Urush va Tinchlik","Lev Tolstoy",10000);
        Book book5 =new Book("Romeo va Jyuletta","Williyam Shekspir",10000);
        Book book6 =new Book("Hamsa","Alisher Navoiy",10000);
        Book[]booksArray= {book,book2,book3,book4,book5,book6};
        bookcase.addBook(booksArray);
        System.out.println();
        System.out.println();
        bookcase.removeBook(book2);
        bookcase.removeBook(book3);
        bookcase.removeBook("Lev Tolstoy");
        bookcase.infoBooks();
        bookcase.addBook(book2);

    }
}
