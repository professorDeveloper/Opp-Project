package masala;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> masala
 * Class Name -> Basket
 * Copyright © : 8/31/2022
 */
public class Basket {
    private int size;
    private Fruit fruit[];
    private int emptySize;
    private int count = 0;

    public Basket(int size) {
        this.size = size;
        emptySize = size;
        fruit = new Fruit[size];
    }

    public boolean add(Fruit fruit) {
        if (!isFull()) {
            this.fruit[count++] = fruit;
            emptySize--;
            return true;
        }
        return false;
    }

    public void show() {
        for (int i = 0; i < count; i++) {
            System.out.println(fruit[i].getName());
            System.out.println(fruit[i].getColor());
        }
    }

    public boolean isFull() {
        return emptySize == 0;

    }

    public boolean isEmpty() {
        return emptySize == size;
    }
}

