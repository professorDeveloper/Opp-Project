package homework10.bookShop;


import java.util.Objects;

/**
 * project : Bootcamp1
 * package : HomeWork10.BookShop
 * author  : Azamov Husanboy
 * date    : 06.09.2022_21:03
 */
public class Book {
    private String bookName;
    private int bookPrice;

    public Book(String bookName, int bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }
}

class BookShop {
    private String libraryName;
    private int bookAmount;
    private int[] bookSizeArray;//
    private Book[] booksArray;
    private int sizeCount;
    private int indexe;
    private int booksCount;
    private int minusSum = 0;
    private int index;
    private boolean isHave;



    public BookShop(String libraryName, int bookAmount) {
        this.libraryName = libraryName;
        this.bookAmount = bookAmount;
        bookSizeArray = new int[16];
        booksArray = new Book[16];
    }

    public int buyBook(Book book, int number) {//10 100.000 =>1.000.000
        if (bookAmount < book.getBookPrice() && bookAmount == 0) return 0;
        if (bookSizeArray.length == sizeCount && booksArray.length == booksCount) {
            bookSizeArray = ArraysUtil.addArrayLists(bookSizeArray);
            booksArray = ArraysUtil.addArrayLists(booksArray);
        }
        if (bookAmount >= book.getBookPrice() * number) {//550.000     kitob narxi 100.000    number 6 ta  150.000 ortiqcha
            booksArray[booksCount++] = book;
            bookSizeArray[sizeCount++] = number;
            bookAmount -= book.getBookPrice() * number;
            return number;
        } else {
            for (int i = 1; i <= number; i++) {//550.000=>50.000
                if (bookAmount > book.getBookPrice()) {
                    bookAmount -= book.getBookPrice();
                    minusSum = i;
                }
            }
            booksArray[booksCount++] = book;
            bookSizeArray[sizeCount++] = minusSum;
        }
        return minusSum;
    }

    public boolean hasBook() {
        return sizeCount > 0;
    }

    public boolean hasBook(Book book) {
        boolean have = false;
        if (!hasBook()) return false;
        for (int i = 0; i < booksCount; i++) {
            if (book.getBookName().equals(booksArray[i].getBookName())) {
                index += bookSizeArray[i];
                indexe = i;
                have = true;
            }
        }
        return have;
    }

    public int getMoney() {
        return bookAmount;
    }

    public int sell(Book book, int sellSumBook) {
        int plus = 0;
        if (!hasBook(book) && booksCount<sellSumBook){
            return 0;
        }else {
        if (index >= sellSumBook) {
            int temp = index - sellSumBook;
            bookSizeArray[indexe] = temp;
            return sellSumBook;
        } else {
            int position = 0;
            boolean have = false;
            for (int i = 0; i < booksCount; i++) {
                if (Objects.equals(booksArray[i].getBookName(), book.getBookName())) {//1,(1=2),3,4,5;
                    position = i;
                    have = true;
                    isHave = true;
                }
            }
            if (have) {
                for (int j = 0; j < booksCount; j++) {
                    if (position != j) {
                        booksArray[plus++] = booksArray[j];
                        bookAmount+=booksArray[plus++].getBookPrice();
                    }
                }
                sizeCount--;
                booksCount--;
            }
            return position;
        }
        }
    }

    public int getCount() {//malum bir miqtorda qancha kitob borligini qaytaradi.
        if (!hasBook()) return 0;
        int revolution = 0;
        for (int i = 0; i < sizeCount; i++) {
            revolution += bookSizeArray[i];
        }
        return revolution;
    }

    public int getCount(Book book) {//jami nechta kitob borligini qaytaradi.
        if (!hasBook()) return 0;
        int joy = 0;
        for (int i = 0; i < booksCount; i++) {
            if (book.getBookName().equals(booksArray[i].getBookName())) {
                joy += bookSizeArray[i];
            }
        }
        return joy;
    }

    public String getBookShopName() {//kitobhonani nomini qaytaradi
        return libraryName;
    }
}

class ArraysUtil {
    public static Book[] addArrayLists(Book[] array) {
        Book[] objects = new Book[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            objects[i] = array[i];
        }
        return array = objects;//referenc ketdi
    }

    public static int[] addArrayLists(int[] array) {
        int[] objects = new int[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            objects[i] = array[i];
        }
        return array = objects;//referenc ketdi
    }
}

class Main {
    public static void main(String[] args) {
        long s=System.currentTimeMillis();
      Book book=new Book("O`tkan kunlar",20000);
      Book book2=new Book("Salom dunyo",20000);
      BookShop bookShop=new BookShop("Kitoblar Do`koni",2000_000);
      assertEquals(bookShop.buyBook(book,10),10);
      assertEquals(bookShop.hasBook(),true);
      assertEquals(bookShop.hasBook(book2),false);
      assertEquals(bookShop.hasBook(book),true);
      assertEquals(bookShop.getMoney(),1_800_000);
      assertEquals(bookShop.getCount(book),10);
      long a=System.currentTimeMillis()-s;
        System.out.println(a);
    }
    public static void assertEquals(Object result, Object expected) {
        if (!result.equals(expected)) {
            throw new IllegalArgumentException("Kutilgan natija: " + expected + " Sizning natijangiz:" + result);
        }
    }
}
