package imtihon.cars;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> imtihon.cars
 * Class Name -> Main
 * Copyright © : 9/16/2022
 */
public class Main {
    public static void main(String[] args) {
        Factory factory1 =new Factory("Mercedes Benz");
        Factory.Car.Model factoryModel=new Factory.Car.Model("GLS 220","Black");
        Factory.Car car =factory1.new Car(factoryModel);
    }
}
