package practice;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> practice
 * Class Name -> Example
 * Copyright © : 9/12/2022
 */
public class Example {
    public static void main(String[] args) {
        new Object(){
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        A a =new A();
        A.B b=new A.B();
        A.B.C c =b.new C();
        A.C ac=a.new C();
        A.C.B ab =ac.new B();
        A.C.B.F af = new A.C.B.F();
    }

}

class A {
    public static class B {
        class C {
        }
    }
    class C {
        class B {
         static class F {

        }

        }
    }
}
