package homework6;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework6
 * Class Name -> Box
 * Copyright © : 8/29/2022
 */
public class Box {
    int weight;
    int count;
    public Box(int _weight){
        weight=_weight;
    }
    public boolean push(Thing thing){
        if (weight==count){
            return false;
        }else {
            count++;
            return true;
        }
    }

    public  boolean isFull(){
        return count==weight;
    }
}

