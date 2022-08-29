package example;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> example
 * Class Name -> Main
 * Copyright © : 8/26/2022
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(interpret("Gooo(al)"));
    }
    public static String interpret(String command) {
        String str=command.replace("()","o");

    return str.replace("(al)","al");
    }
}
