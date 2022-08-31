package caroil;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> caroil
 * Class Name -> Outgoing
 * Copyright © : 8/31/2022
 */
public class Outgoing {
    int road;
    int litre;

    public Outgoing(int road, int consumption) {
        this.road = road;
        this.litre = consumption;
    }

    public int getRoad() {
        return road;
    }

    public int getLitre() {
        return litre;
    }
}
