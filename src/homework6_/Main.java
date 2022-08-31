package homework6_;

import java.util.ArrayList;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework6_
 * Class Name -> Main
 * Copyright © : 8/30/2022
 */
public class Main {
    public static void main(String[] args) {
        Device device=new Device(80);
        B ba=new B();
        System.out.println(ba.age);
        App app1=new App("Telegram",10);
        App app2=new App("FaceBook",15);
        App app3=new App("ImeMessage",5);
        App app4=new App("Viber",10);
        App app5=new App("Telegram",10);
        App app6=new App("OK",10);
        App app7=new App("FaceId",60);
        System.out.println("App1:"+device.install(app1));
        System.out.println("App2:"+device.install(app2));
        System.out.println("App3:"+device.install(app3));
        System.out.println("App4:"+device.install(app4));
        System.out.println("App5:"+device.install(app5));
        System.out.println("App6:"+device.install(app6));
        System.out.println("App7:"+device.install(app7));
        System.out.println("");
        device.showApp();
        device.uninstall("OK");
        device.uninstall("Viber");
        device.uninstall("FaceBook");
        System.out.println();
        device.showApp();
        device.run("OK");
        device.run("Telegram");
        device.run("ImeMessage");
        System.out.println("================================");
        Capacity c=new Capacity(100);
        Ticket t=new Ticket(1400);
        Buss b=new Buss(t,c);
        int inPassanger=b.inPassanger(5);
        int outPassanger=b.outPassanger(3);
        System.out.println(inPassanger);
        System.out.println(outPassanger);
        System.out.println(b.getBalance());
        System.out.println(b.isFull());
        System.out.println(b.isEmpty());
        int a=13;
        double s=3.0;
        //

    }
}
 class Buss {
    private Ticket ticket;
    private  Capacity capacity;
    private  int emptySpace;
    private  int balance;

    public Buss(Ticket ticket, Capacity capacity) {
        this.ticket = ticket;
        this.capacity = capacity;
        emptySpace=capacity.getCapacity();
    }
    public boolean isFull(){
        return emptySpace==0;
    }
    boolean isEmpty(){
        return  emptySpace==capacity.getCapacity();
    }
    public int inPassanger(int passanger){
        if (!isFull()){
            if (emptySpace>=passanger){
                emptySpace-=passanger;
                balance+=passanger*ticket.getPrice();
                return passanger;
            }else {
                int c=emptySpace;
                balance+=emptySpace*ticket.getPrice();
                emptySpace=0;
                return c;
            }

        }
        return 0;
    }
    public int outPassanger(int passanger){
        if (!isEmpty()){
            int fullSpace=capacity.getCapacity()-emptySpace;
            if (fullSpace>=passanger){
                emptySpace+=passanger;
                return passanger;
            }else {
                emptySpace+=fullSpace;
                return fullSpace;
            }
        }
        return 0;
    }

    public int getBalance() {
        return balance;
    }
}

class Ticket {
    private int price;

    public Ticket(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Capacity {
    private int capacity;

    public Capacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

 class App {
    String name;
    int volume;

    public App(String name, int size) {
        this.name = name;
        this.volume = size;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

}

class Device {
    private int memory;
    private ArrayList<String> names;
    private ArrayList<Integer> sizes;
    private int currentMemory;
    private ArrayList<Integer> countes;

    public Device(int memory) {
        this.memory = memory;
        names = new ArrayList();
        sizes = new ArrayList<>();
        currentMemory = memory;
        countes = new ArrayList<>();

    }

    public boolean install(App app) {
        if (!(names.contains(app.getName())) && (currentMemory >= app.getVolume())) {
            names.add(app.getName());
            sizes.add(app.getVolume());
            currentMemory -= app.getVolume();
            return true;
        }
        return false;
    }

    public void showApp() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println("=============================[" + (i + 1) + "]===========================");
            System.out.println("AppName: " + names.get(i));
            System.out.println("AppSize: " + sizes.get(i));
            System.out.println("=====================================================================");
        }
    }

    public boolean uninstall(String name) {
        if (names.contains(name)) {
            int a = names.indexOf(name);
            names.remove(a);
            currentMemory += sizes.get(a);
            return true;
        }
        return false;
    }
    public void run(String name){
        if (names.contains(name)){
            int c=names.indexOf(name);
            countes.add(c);
            System.out.println(name+" is running App size:"+sizes.get(c));
        }
    }
    public void  info(){
        System.out.println(countes.size()+"Apps Runned");
        for (int i = 0; i < countes.size(); i++) {
            System.out.println("=============================[" + (i + 1) + "]===========================");
            System.out.println("AppName: " + names.get(i));
            System.out.println("AppSize: " + sizes.get(i));
            System.out.println("=====================================================================");

        }
    }
}