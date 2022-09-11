package homework8;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework7
 * Class Name -> Main
 * Copyright © : 8/31/2022;
 */
public class Main {
    public static void main(String[] args) {
        A a = new A(4);
        System.out.println(a.getValue());
//        System.out.println("\"\"");
        B by = new B(5);
        System.out.println(by.getValue());
        A2 a2 = new A2();
        a2.show();
        A3 a3 = new A3();
        B3 b3 = new B3();//
        a3.setParent(b3);
        a3.setParent(b3);
        System.out.println(b3.getChildCount(a3));
    }
}

class A {
    int value;

    public A(int value) {
        this.value = value;
    }
    public A(){
        this(1);

    }

    public int getValue() {
        return value;
    }
}

class B extends A {
    public B(int value) {
        super(value);
    }

    @Override
    public int getValue() {
        return 2 * super.getValue();
    }
}

class A2 {
    private int num_int;
    private double num_double;

    public void setValue(int num_int) {
        this.num_int++;
    }

    public void setValue(double num_float) {
        this.num_double++;
    }

    public void show() {
        if (num_int == num_double) {
            System.out.println("not used");
        } else if (num_int > num_double) {
            System.out.println("integer number");
        } else System.out.println("float number");
    }
}

class A3 {
    public void setParent(B3 b3) {
        b3.setCount();
    }
}

class B3 {
    private int count;

    public int getChildCount(A3 a3) {
        return count;
    }

    public void setCount() {
        this.count++;
    }
}
