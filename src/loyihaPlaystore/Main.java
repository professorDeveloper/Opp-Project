package loyihaPlaystore;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> loyihaPlaystore
 * Class Name -> Main
 * Copyright © : 8/31/2022
 */
public class Main {
    public static void main(String[] args) {
        App app =new App("Zoom",40);
        App app2 =new App("Telegram",50);
        App app3 =new App("Instagram",64);
        App app4 =new App("FaceBook",100);
        Playmarket playmarket=new Playmarket(200);
        System.out.println(playmarket.addApp(app));
        System.out.println(playmarket.addApp(app2));
        System.out.println(playmarket.addApp(app3));
        System.out.println(playmarket.addApp(app4));
        playmarket.infoApp();

        System.out.println("App Count: "+playmarket.infoCountApp());
        System.out.println("=================================");
        System.out.println("Memory Size: "+playmarket.infoMemory());


    }
}
