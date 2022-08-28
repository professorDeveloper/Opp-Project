package homework4;

import java.util.Arrays;
/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> student
 * Class Name -> Main
 * Copyright © : 8/26/2022
 */
public class Task4 {
    public static void main(String[] args) {

        System.out.println("=============================================================");
        Student student = new Student("Husanboy",1,16);
        student.Info();
        System.out.println("=============================================================");

        Shape shape = new Shape("Black",10,20);
        shape.show();
        System.out.println("=============================================================");

        shape.showPerimeter();

        System.out.println("=============================================================");

        Contact contact = new Contact("Husanboy",992803809,"https://assets.leetcode.com/users/avatars/avatar_1661248124.png");
        contact.Show();
        System.out.println("=============================================================");
        Laptop laptop = new Laptop();
        laptop.color = "Serious Black";
        laptop.battaryCellCount = 3000;
        laptop.modelName = "Acer";
        laptop.screenSize = 1090;
        laptop.serialNumber = 1200;
        System.out.println("Laptop Name:" + laptop.modelName);
        System.out.println("Laptop Color:" + laptop.color);
        System.out.println("Laptop Battery Cell Count:" + laptop.battaryCellCount);
        System.out.println("Laptop Screen Size:" + laptop.screenSize);
        System.out.println("Laptop SerialNumber:" + laptop.serialNumber);
    }
}
 class Student {
    String name;
    int course;
    int age;
    public  Student(String _name, int _course, int _age) {
        name = _name;
        course = _course;
        age = _age;
    }
    void Info(){
        System.out.println("Student Name: "+name);
        System.out.println("Student course: "+course);
        System.out.println("Student age: "+age);
    }
}
 class Shape {
    String color;
    int perimeter;
    int square;
    Shape(String _color,int _perimeter, int _square){
        color=_color;
        perimeter=_perimeter;
        square=_square;
    }
    void show(){
        System.out.println("Shape Color:"+color);
        System.out.println("Shape Perimeter:"+perimeter);
        System.out.println("Shape Square:"+square);
    }
    void  showPerimeter(){
        System.out.println("Perimeter: "+perimeter);
    }
}
 class Contact {
    String name;
    int number;
    String imgUrl;
    Contact(String _name,int _number, String _imgUrl){
        name=_name;
        number=_number;
        imgUrl=_imgUrl;
    }
    void Show(){
        System.out.println("Contact name: "+name);
        System.out.println("Contact number: "+number);
        System.out.println("Contact imgUrl: "+imgUrl);
    }
}
 class Laptop {
    int screenSize;
    int battaryCellCount;
    String modelName;
    int serialNumber;
    String color;



}