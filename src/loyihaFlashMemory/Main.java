package loyihaFlashMemory;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> loyihaFlashMemory
 * Class Name -> Main
 * Copyright © : 9/1/2022
 */
public class Main {
    public static void main(String[] args) {
        Music music1=new Music(20);
        Music music3=new Music(30);
        Music music4=new Music(13);
        Music music5=new Music(40);
        Video video1=new Video(60);
        Video video2=new Video(100);
        Video video3=new Video(300);
        Video video4=new Video(200);

        loyihaFlashMemory.FlashMemory flashMemory=new loyihaFlashMemory.FlashMemory(1000);
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
    }
}
