package homework13;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework12
 * Class Name -> Car
 * Copyright © : 9/14/2022
 */
public class Car {
    private final String name;
    private   int busyCapacity;
    private final int maxCapacity;
    private static String a = null;
    private static Car car = null;


    private Car(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = busyCapacity;
    }
    public static Car getInstance(String name, int capacity) {
        if (a == null) {
            car = new Car(name, capacity);
        }
        return car;
    }




    boolean isActive() {
        return busyCapacity > 0;
    }

    boolean refuel(int addPetrol) {
        if (addPetrol <= maxCapacity - busyCapacity) {
            busyCapacity += addPetrol;
            return true;
        }
        return false;
    }
    int getMaxWay(int value){
        return busyCapacity*value;
    }

    public String getName() {
        return name;
    }
}


