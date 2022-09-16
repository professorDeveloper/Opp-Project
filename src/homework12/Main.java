package homework12;

import questionsHomework9.Test;

import java.util.logging.Handler;


/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework12
 * Class Name -> Main
 * Copyright © : 9/13/2022
 */
public class Main {
    public static void main(String[] args) {




        Oven object = new Oven(1200, 1200);
        object.switchOn(1, 30);
        object.showInfo();
        object.showInfo();        Lid lid2 = new Lid("aa1234b");

        object.switchOff(1);
        object.switchOn(1,30);
        object.showInfo();
        Bonus bonus = new Bonus(4);
        Lid lid = new Lid("aabb1122");
        Lid lid3 = new Lid("AA2211BB");
        Lid lid4 = new Lid("BBbb2222");
        Lid lid5 = new Lid("BBbb22221");
        TestUtil.assertEquals(bonus.check(lid), true);//true
        TestUtil.assertEquals(bonus.check(lid2), false);//false
        TestUtil.assertEquals(bonus.check(lid3), true);//true
        TestUtil.assertEquals(bonus.check(lid4), true); //true
        TestUtil.assertEquals(bonus.check(lid5), false);//false
        TestUtil.assertEquals(bonus.check(lid), true);//true
        TestUtil.assertEquals(bonus.check(lid), false);//false
        System.out.println("Misol Yechildi !");

    }
}

class Oven {
    private final int power1;  // bir minut uchun sarf
    private final int power2;  // bir minut uchun sarf
    private int wholePower;
    private boolean mode1;
    private boolean mode2;
    private boolean mode3;

    public Oven(int mode_1, int mode_2) {
        this.power1 = mode_1 / 60;  // soat -> minut
        this.power2 = mode_2 / 60;
    }

    void switchOn(int i, int time) {
        switch (i) {
            case 1:
                if (mode2 != true && mode3 != true) {
                    wholePower += power1 * time;
                    mode1 = true;
                    break;
                }
                break;
            case 2:
                if (mode1 != true && mode3 != true) {
                    wholePower += power2 * time;
                    break;
                }
                break;
            case 3:
                if (mode1 != true && mode2 != true) {
                    wholePower += power1 * time + power2 * time;
                    break;
                }
                break;
            default:
                System.out.println("Rejim noto`g`ri tanlandi");

        }
    }

    void switchOff(int mode) {
        switch (mode) {
            case 1:
                mode1 = false;
                break;

            case 2:
                mode2 = false;
                break;
            case 3:
                mode3 = false;
                break;
            default:
                System.out.println("Rejim noto`g`ri tanlandi");
        }

    }

    void showInfo() {
        System.out.println("Jami sarflangan quvvat: " + wholePower);
    }
}

class TestUtil {
    public static void assertEquals(Object result, Object expected) {
        if (!result.equals(expected)) {
            throw new IllegalArgumentException("Kutilgan natija: " + expected + " Sizning natijangiz:" + result);
        }
    }
}

class Lid {
    private String code;

    public Lid(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

class Bonus {
    private int count;
    private int numCount;

    public Bonus(int count) {
        this.count = count;
    }

    public boolean check(Lid lid) {
        int countFirst = 0;
        int countSecond = 0;
        int vowel = 0;
        int consonant = 0;
        String code = lid.getCode().toLowerCase().replace(" ", "");
        if (code.length() == 8 && numCount < count) {
            char[] array = code.toCharArray();

            for (int i = 0; i < array.length; i++) {
                int number;
                if (i <= 3) {
                    if (array[i] >= 'a' && array[i] <= 'z') {//1+2+1+2 =6
                        if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'u' || array[i] == 'o') {
                            vowel++;
                        }
                        if (!(array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'u' || array[i] == 'o')) {
                            consonant++;
                        }
                        number = array[i] - 'a' + 1;
                    } else {
                        number = array[i] - '0';
                    }
                    countFirst += number;
                } else {
                    if (array[i] >= 'a' && array[i] <= 'z') {//1+2+1+2 =6
                        number = array[i] - 'a' + 1;
                    } else {
                        number = array[i] - '0';
                    }
                    countSecond += number;
                }
            }
            boolean isBonus = countFirst == countSecond || consonant == vowel;
            if (isBonus) numCount++;
            return isBonus;
        }
        return false;
    }

}

