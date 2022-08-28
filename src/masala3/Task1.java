package masala3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> masala3
 * Class Name -> Task1
 * Copyright © : 8/25/2022
 */

class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < array.length; i++) {
            array[i] += 2;
        }
        System.out.println(Arrays.toString(array));
    }

}

class Task2 {
    public static void main(String[] args) {
        int count = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray[index++] = array[i];
            }
        }
        for (int i = newArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (newArray[j] < newArray[j + 1]) {
                    int t = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}

class Task3 {
    public static void main(String[] args) {
        int[] array = {2, 1, 9, 4, 5, 6, 8};
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1] ^ array[j];
                    array[j + 1] = array[j] ^ array[j + 1];
                    array[j] = array[j + 1] ^ array[j];
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}

class Task4 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(solution(a, 2)));
        // 10 14 15 18 17 12 13
    }

    public static int[] solution(int[] a, int k) {
        int item = a[k];
        for (int i = 0; i < a.length; i++) {
            a[i] += item;
        }
        return a;
    }
}

class Task5 {
    public static void main(String[] args) {
        int[] newArray = {1, 3, 9, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for (int i = k - 1; i < newArray.length; i += k) {
            System.out.print(newArray[i] + ",");

        }
        System.out.println("\b");
    }
}

class Task6 {
    public static void main(String[] args) {
        int[] array = {10, 3, 9, 4, 5, 6, 9};
        int element = array[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (element > array[i]) {
                element = array[i];
                i = array.length;
            }
        }
        System.out.println(element);
    }
}

class Task7 {
    public static void main(String[] args) {
        int[] array = {10, 3, 9, 4, 5, 6, 7};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
        }
        System.out.println(min);
    }
}

class Task8 {
    public static void main(String[] args) {
        int[] array = {10, 3, 9, 4, 5, 6, 7};
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 5) {
                newArray[i] = 2 * array[i];
            } else {
                newArray[i] = array[i] / 2;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

}

class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 3, 9, 4, 5, 6, 7};
        int[] newArray = new int[array.length - 1];
        System.out.print("K:");
        int k = scanner.nextInt();
        int count = 0;
        if (0 <= k && k < array.length) {
            for (int i = 0; i < array.length; i++) {
                if (i != k) {
                    newArray[count++] = array[i];
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}

class Task10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[]{10, 3, 4, 3, 4, 5, 8, 10, 3})));
    }

    public static int[] removeDuplicates(int[] arr) {

        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    int shiftLeft = j;
                    for (int k = j + 1; k < end; k++, shiftLeft++) {
                        arr[shiftLeft] = arr[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
        for (int i = 0; i < end; i++) {
            whitelist[i] = arr[i];
        }
        return whitelist;
    }

}

//Extremal 1 Homework : 88 byte
//Extremal 2 Homework : 216 byte
//Extremal 4 Homework 168 byte
