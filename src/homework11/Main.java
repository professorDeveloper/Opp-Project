package homework11;

import java.util.Objects;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework11
 * Class Name -> Main
 * Copyright © : 9/9/2022
 */
public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.age = 1;
        B b1 = new B();
        b1.age = 1;
        System.out.println(b.equals(b1.age));
        b.getAge();
        System.out.println();
        A4 a4 = A4.getInstance();
    }
}

abstract class A {

    private static Object A = null;
    public static Object o;

    abstract int getAge();

    @Override
    public boolean equals(Object object) {
        return object.equals(o);
    }


    private class o {
    }
}

abstract class A1 {
    private int members;

    protected int Method(int temp) {
        return members = temp;
    }
}

class B1 extends A1 {
    @Override
    public int Method(int temp) {
        return super.Method(temp);
    }
}

class B extends A {
    int age;

    @Override
    int getAge() {
        return age;
    }

}

class Circle extends ShapeAngles {
    int raduis;

    public Circle(int raduis) {
        this.raduis = raduis;
    }

    @Override
    float getSquare() {
        return (float) (Math.PI * Math.pow(raduis, 2));
    }

}

class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    float getSquare() {
        return a * b;
    }
}

abstract class Shape {
    abstract double getPerimeter();

    abstract float getSquare();
}


abstract class ShapeAngles extends Shape {
    @Override
    double getPerimeter() {
        return 0;
    }
}

class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    float getSquare() {
        float p = (float) (getPerimeter() / 2);
        return (float) (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

}

class A4 {

    private A4() {

    }

    public static A4 getInstance() {

        return new A4();
    }
}
