package practice;

import java.util.Queue;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> practice
 * Class Name -> Car
 * Copyright © : 9/13/2022
 */
public class Car {
    private final String name;
    private final int busyCapacity;
    private  int maxCapacity;

    private  static  Car carnage;
    private Car(String name, int busyCapacity) {
        this.name = name;
        this.busyCapacity = busyCapacity;
    }
    public  static Car getInstance(String name,int busyCapacity){
        if (carnage==null) return new Car(name, busyCapacity);
        return new Car(name,busyCapacity);
        }

    boolean isActive() {
        return busyCapacity != 0;
    }


}
