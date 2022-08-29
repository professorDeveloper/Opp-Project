package homework6;

import java.util.Scanner;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework6
 * Class Name -> Main
 * Copyright © : 8/29/2022
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        int exit = -1;

        System.out.println("Bizning o'yinimizga xush kelibsiz!!! \nBizni o'yinimizni boshlaganizdan so'ng tugatishni iloji yo'q :D");

        while (true){
            System.out.println("1 -> Javada String classi bo'yicha savollar;\n2 -> Math classidan savollar;");
            System.out.print("Buyruqni kiriting : ");
            int command = scanner.nextInt();
            switch (command) {
                case 1 -> controller.questionsString();
                case 2 -> controller.questionsMath();
            }

        }
    }
}
