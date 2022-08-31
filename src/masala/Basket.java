package masala;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> masala
 * Class Name -> Basket
 * Copyright © : 8/31/2022
 */
public class Basket {
    int count;
    int size;
    Fruit[] fruitsArray;

    public Basket(int size) {
        this.size = size;
        fruitsArray = new Fruit[size];
    }

    public boolean add(Fruit fruit) {
        if (isFull()) return false;
        fruitsArray[count++] = fruit;
        return true;
    }

    public void show() {
        for (int i = 0; i < count; i++) {
            System.out.println("======================="+(i+1)+"========================");
            System.out.println("Fruit Name:"+fruitsArray[i].getName());
            System.out.println("Fruit Color:"+fruitsArray[i].getColor());
            System.out.println("=========================================================");
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == fruitsArray.length;
    }
}
