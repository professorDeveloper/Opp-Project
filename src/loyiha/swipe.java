package loyiha;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> loyiha
 * Class Name -> swipe
 * Copyright © : 8/24/2022
 */
public class swipe {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        a = b ^ a;
        b = a ^ b;
        a = b ^ a;
        System.out.println(a);
        System.out.println(b    );
    }
}
