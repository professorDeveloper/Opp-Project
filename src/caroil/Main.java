package caroil;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> caroil
 * Class Name -> Main
 * Copyright © : 8/31/2022
 */
public class Main {
    public static void main(String[] args) {
        Capacity _capacity=new Capacity(50);//bag=50 hajmi
        Outgoing _outgoing=new Outgoing(100,5);// 100 km ga 5 litre (1 km=0.05 litre)
        Direction _direction=new Direction(23);//biz yurmoqchi bo`lgan km
        Oil _oil=new Oil(30);//yoqilg`i qo`shish uchun 30 litre
        Oil _oil2=new Oil(40);//yoqilg`i qo`shish uchun 30 litre
        Car _car=new Car(_capacity,_outgoing);//bag=50 litre; _outgoing kmga litre ketshi
        System.out.println(_car.go(_direction));//_car.go= bormoqchi bo`lgan manzilimiz (false)
        System.out.println(_car.addOil(_oil));//30 litre zaprvka qilish (true)
        System.out.println(_car.go(_direction));//true
        System.out.println(_car.addOil(_oil2));//40
        System.out.println(_car.addOil(_oil));
    }
}
