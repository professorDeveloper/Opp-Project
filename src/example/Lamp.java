package example;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> PACKAGE_NAME
 * Class Name ->
 * Copyright © : 8/25/2022
 */
public class Lamp {
    boolean isTurn;

    void turnOn() {
        isTurn = true;
    }

    void turnOff() {
        isTurn = false;

    }
    void  show(){
        System.out.println(isTurn);
    }
}
