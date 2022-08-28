package masala2;

import java.util.Scanner;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> masala2
 * Class Name -> Main
 * Copyright © : 8/24/2022
 */
public class Main {


}
class Masala1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Bir xil");
        } else {
            System.out.println("Xar Xil");
        }
    }
}
class Masala2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("birinchi so`z:");
        String a = scanner.nextLine();
        System.out.println("Ikkinchi so`z");
        String b = scanner.nextLine();
        String s = remVowel(a);
        String s1 = remVowel(b);
        if (s.equalsIgnoreCase(s1)) {
            System.out.println("Bir xil");
        } else {
            System.out.println("Xar Xil");
        }
    }
    static String remVowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

}
class Masala3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] charArray = a.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            char unli = charArray[i];
            if (unli == 'a' || unli == 'e' || unli == 'i' || unli == 'u' || unli == 'o' || unli == 'A' || unli == 'E' || unli == 'U' || unli == 'O') {
                count++;
            }

        }
        System.out.println(count);

    }


}
class Masala4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] charArray = a.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            char unli = charArray[i];
            if (!(unli == 'a' || unli == 'e' || unli == 'i' || unli == 'u' || unli == 'o' || unli == 'A' || unli == 'E' || unli == 'U' || unli == 'O')) {
                count++;
            }
        }
        System.out.println(count);

    }


}
class Masala5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String a = scanner.next ( );
        String b = scanner.next ( );
        System.out.println (isValidString (a, b));
    }
    static boolean isValidString(String a,String b){
        if ( a.length ()!=b.length () ) return false;
        return (b.toLowerCase().equals (a) && a.toUpperCase().equals (b));
    }
}

//Test 6 a=37 b=16 c=40
//Test 7 a=22 b=18 c=27
//Test 8 a=29 b=14 c=15
//Test 9 a=12 b=14 c=4
//Test 10  a=12 b=14 c=-28
//Test 11 a=12 b=14 c=-28