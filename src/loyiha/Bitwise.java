package loyiha;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> loyiha
 * Class Name -> Bitwise
 * Copyright © : 8/24/2022
 */
public class Bitwise {
    public static void main(String[] args) {
     int a =12;
     int b =14;
     int c =a+++ ++b + ++b;
     c+=a-b;
     a-=b-c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
