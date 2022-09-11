package homework7;


import loyihaFlashMemory.FlashMemory;
import loyihaFlashMemory.Music;
import loyihaFlashMemory.Video;


public class Main {
    public static void main(String[] args) {
        App app =new App("Zoom",40);
        App app2 =new App("Telegram",100);
        App app3 =new App("Instagram",164);
        App app4 =new App("FaceBook",20);
        App app5 =new App("Telegram",30);
        PlayMarket playmarket=new PlayMarket(400);
        System.out.println(playmarket.addApp(app));
        System.out.println(playmarket.addApp(app2));
        System.out.println(playmarket.addApp(app3));
        System.out.println(playmarket.addApp(app4));
        System.out.println(playmarket.addApp(app5));
        playmarket.infoApp();
        System.out.println();
        playmarket.infoMemory();
        System.out.println(playmarket.removeApp("Telegram"));
        playmarket.infoApp();
        playmarket.infoMemory();
        playmarket.infoAppCount();
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

        loyihaFlashMemory.Music music1=new loyihaFlashMemory.Music(20);
        loyihaFlashMemory.Music music3=new loyihaFlashMemory.Music(30);
        loyihaFlashMemory.Music music4=new loyihaFlashMemory.Music(13);
        loyihaFlashMemory.Music music5=new Music(40);
        loyihaFlashMemory.Video video1=new loyihaFlashMemory.Video(60);
        loyihaFlashMemory.Video video2=new loyihaFlashMemory.Video(100);
        loyihaFlashMemory.Video video3=new loyihaFlashMemory.Video(300);
        loyihaFlashMemory.Video video4=new Video(200);

        FlashMemory flashMemory=new FlashMemory(1000);
        System.out.println("fleshMemory isEmpty:"+flashMemory.isEmpty());
        System.out.println("FleshMemory isFull:"+flashMemory.isFull());
        System.out.println("Music1 Added flashMemory:"+flashMemory.addFile(music1));
        System.out.println("Music5 Added flashMemory:"+flashMemory.addFile(music5));
        System.out.println("Music3 flashMemory:"+flashMemory.addFile(music3));
        System.out.println("Music4 flashMemory:"+flashMemory.addFile(music4));
        System.out.println("Video1 flashMemory:"+flashMemory.addFile(video1));
        System.out.println("Video2 flashMemory:"+flashMemory.addFile(video2));
        System.out.println("Video3 flashMemory:"+flashMemory.addFile(video3));
        System.out.println("Video3 flashMemory:"+flashMemory.addFile(video3));
        System.out.println("Video4 flashMemory:"+flashMemory.addFile(video4));
        System.out.println("Video4 flashMemory:"+flashMemory.addFile(video4));
        System.out.println("Flesh Memory size :"+flashMemory.infoMemory());
        BookCaseHard bookCaseHard=new BookCaseHard(10);
        Book bookHard =new Book("O`tkan kunlar Romani","Abdulla Qodiriy",10000);
        Book bookHard2 =new Book("Aqilli bola Boy bola","Deniel Kornigey",10000);
        Book bookHard3 =new Book("Chol va Dengiz","Ernest Heminguey",10000);
        Book bookHard4 =new Book("Urush va Tinchlik","Lev Tolstoy",10000);
        Book bookHard5 =new Book("Romeo va Jyuletta","Williyam Shekspir",10000);
        Book bookHard6 =new Book("Hamsa","Alisher Navoiy",10000);
        Book bookHard7 =new Book("Chol va Dengiz","Ernest Heminguey",10000);
        Book[]booksHardArray= {bookHard,bookHard2,bookHard3,bookHard7,bookHard4,bookHard5,bookHard6};
        bookcase.addBook(booksHardArray);
        System.out.println(bookCaseHard.clearBookCase());
        bookcase.infoBooks();
    }
}
