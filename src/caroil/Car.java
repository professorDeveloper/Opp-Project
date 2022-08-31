package caroil;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> caroil
 * Class Name -> Car
 * Copyright © : 8/31/2022
 */
public class Car {
    Capacity capacity;
    //    int getOil;
    int oilCount;
    Outgoing outgoing;

    public Car(Capacity _capacity, Outgoing _outgoing) {
        capacity = _capacity;
        outgoing = _outgoing;
    }



    public boolean go(Direction direction) {
        double a = (double) outgoing.getLitre() / outgoing.getRoad();
        if (oilCount != 0 && a * direction.getD() <= oilCount) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addOil(Oil _oil) {
        int memoryBag = capacity.getVolume();
        if (memoryBag >= oilCount) {
            oilCount += _oil.getOil();

            return true;
        } else {
            return false;
        }
    }


}
