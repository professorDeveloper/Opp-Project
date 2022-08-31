package masala;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> masala
 * Class Name -> Main
 * Copyright © : 8/31/2022
 */
public class Main {
    public static void main(String[] args) {
        Fruit fruit=new Fruit("Olma","Qizil");
        Fruit fruit2=new Fruit("Olcha","Qizil");
        Fruit fruit3=new Fruit("Gilos","Qizil");
        Basket basket=new Basket(3);
        System.out.println(basket.add(fruit));
        System.out.println(basket.add(fruit2));
        System.out.println(basket.add(fruit3));
        System.out.println(basket.isEmpty());
        System.out.println(basket.isFull());
    }

}
