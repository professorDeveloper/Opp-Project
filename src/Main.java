/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> PACKAGE_NAME
 * Class Name -> Main
 * Copyright © : 9/7/2022
 */
public class Main {
    public static void main(String[] args) {
        A a2 = new A();
        a2.getPosition(a2);
        a2.getPosition(a2);
        a2.getPosition(a2);
        a2.show();
    }
}

class A{
    int count;
    void getPosition(A a3){
        a3.count++;
    }
    void show(){
        System.out.println(count);
    }
}


