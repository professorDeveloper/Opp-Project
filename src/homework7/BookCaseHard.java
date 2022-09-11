package homework7;

import Book.Book;

import java.util.Objects;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework7
 * Class Name -> BookCaseHard
 * Copyright © : 9/6/2022
 */
public class BookCaseHard {
    int size;
    private Book[] booksArray;
    private int count;//
    private int minus;
    private boolean isHave = false;

    public BookCaseHard(int _size) {
        size = _size;
        booksArray = new Book[size];
    }

    public void addBook(Book _book) {
        if (count < size) {
            booksArray[count++] = _book;
            showMassage("Book add successful ");
        } else {
            showMassage("Book not add");
        }
    }

    public void addBook(Book[] _book) {
        minus = _book.length + count - size;
        if ((minus) > 0) {
            for (int i = 0; i < _book.length - (minus); i++) {
                booksArray[count++] = _book[i];
            }
        } else {
            for (int i = 0; i < _book.length; i++) {
                booksArray[count++] = _book[i];
            }
        }
    }

    private void showMassage(String massage) {//3
        System.out.println(massage);
    }

    public void removeBook(Book _book) {
        int plus = 0;
        if (booksArray.length <= 0) {
            showMassage("Hech qanday kitob yo`q ! Kitob qo`shing ");
            return;
        } else {
            int index = 0;
            boolean have = false;
            for (int i = 0; i < count; i++) {
                if (Objects.equals(booksArray[i].getName(), _book.getName())) {//1,(1=2),3,4,5;
                    index = i;
                    have = true;
                    isHave = true;
                }
            }
            if (have) {
                for (int j = 0; j < count; j++) {
                    if (index != j) {
                        booksArray[plus++] = booksArray[j];
                    }
                }
                count--;
            }
        }
    }

    public void removeBook(String authorName) {//5
        int plus = 0;
        if (booksArray.length <= 0) {
            showMassage("Hech qanday kitob yo`q ! Kitob qo`shing ");
            return;
        } else {
            int index = 0;
            boolean have = false;
            for (int i = 0; i < count; i++) {
                if (Objects.equals(booksArray[i].getAuthor1(), authorName)) {//1,(1=2),3,4,5;
                    index = i;
                    have = true;
                    isHave = true;
                }
            }
            if (have) {
                for (int j = 0; j < count; j++) {
                    if (index != j) {
                        booksArray[plus++] = booksArray[j];
                    }
                }
                count--;
            }
        }
    }

    public void infoBooks() {//6
        if (booksArray.length <= 0) {
            showMassage("BooksCase isEmpty ! please add Book ");
        }
        if (isHave) {
            for (int i = 0; i < count; i++) {
                System.out.println("=========================[" + (i + 1) + "]=======================");
                System.out.println("Book Name:" + booksArray[i].getName());
                System.out.println("Book Author:" + booksArray[i].getAuthor1());
                System.out.println("Book Cost:" + booksArray[i].getCost());
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("=========================[" + (i + 1) + "]=======================");
                System.out.println("Book Name:" + booksArray[i].getName());
                System.out.println("Book Author:" + booksArray[i].getAuthor1());
                System.out.println("Book Cost:" + booksArray[i].getCost());
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }
        }

    }//kito

    public boolean clearBookCase() {
        for (int i = 0; i < count; i++) {//i0 i1 i2 i3 i4
            String b = booksArray[i].getName();
            for (int j = i+1; j < count; j++) {//j1 j2 j3 j4
                if (b.contains(booksArray[j].getName())){
                    removeBook(booksArray[j]);
                return true;
                }
            }
        }
        return false;
    }

}
