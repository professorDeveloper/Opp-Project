package imtihon;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> imtihon
 * Class Name ->
 * Copyright © : 9/16/2022
 */
public class Main {
    public static void main(String[] args) {

       Author.print();
//        UserData userData=new UserData("Husanboy",18,"+998992803809");
//        UserData userData2=new UserData("Talat",31,"+990001451");
//        UserData userData3=new UserData("Said",17,"+998992803809");
//        RegisterController registerController=new RegisterController(4);
//        registerController.logListener(new LoginInterface() {
//            @Override
//            public void showMessage(String s) {
//                System.out.println(s);
//            }
//        });
//        registerController.register(userData);
//        registerController.checkSmsCode("+998992803809",3012);
//        registerController.
    }

    static void show(short abacus) {
        System.out.println(abacus);
    }
}

//interface Box{
class Author {
    int age = getAge();

    {
        System.out.println(age);
    }

    static class Inner {
        public Inner() {
            System.out.println(5);
        }

        void show() {
            System.out.println(1);
        }

    }
    static {
        System.out.println(2);
    }
    int getAge(){
        System.out.println(3);
        return 3;
    }
    static void print(){
        System.out.println(4);
        new Inner().show();
    }
}
interface  calculate {
    int VAR=0;
    void call(int item);
}
class  display implements calculate{
    int x;
    @Override
    public void call(int item) {
        if (item<2) {
            x = VAR;
        }else  x=item*item;
    }
}
class Test{
    public static void main(String[] args) {
        display[] arr=new display[3];
        for (int i = 0; i < 3; i++) {
            arr[i]=new display();
            arr[0].call(0);
            arr[1].call(1);
            arr[2].call(2);
            System.out.println(arr[0].x+" "+arr[1].x+" "+arr[2].x);
        }
    }
}
