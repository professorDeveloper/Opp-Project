package homework6;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework6
 * Class Name ->
 * Copyright © : 8/29/2022
 */
import java.util.Random;
import java.util.Scanner;

public class Controller {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    public void questionsString(){

        Question[] questions = new Question[21];

        questions[0] = new Question("Ikki satrni bir-biriga qo'shuvchi  String classini funksiyasi?" , "concat()");
        questions[1] = new Question("Ikki satrni bir-biriga ASCII jadvali bo'yicha taqqoslaydigan String classini funksiyasi?" , "compareTo()");
        questions[2] = new Question("Berilgan satrni berilgan indeks bo'yicha kesib oluvchi String classini funksiyasi?" , "substring()");
        questions[3] = new Question("Ikki satrni bir-biriga ASCII jadvali bo'yicha harflarning katta kichikligiga e'tibor bermay taqqoslaydigan String classini funksiyasi?" , "compareToIgnoreCases()");
        questions[4] = new Question("Ikki satrni bir-biriga tengligini tekshiruvchi String classini funksiyasi?" , "equals()");
        questions[5] = new Question("Ikki satrni bir-biriga tengligini harf shriftlariga qaramay tekshiradigan String classini funksiyasi?" , "equalsIgnoreCases()");
        questions[6] = new Question("Berilgan satrni berilgan boshqa satr bilan boshlanganligni tekshiruvchi String classini funksiyasi?" , "startsWith()");
        questions[7] = new Question("Berilgan satrni berilgan boshqa satr bilan tugagan ekanligini tekshiruvchi String classini funksiyasi?" , "endsWith()");
        questions[8] = new Question("Berilgan satr ichida berilgan boshqa satr borligini tekshiruvchi String classini funksiyasi?" , "contains()");
        questions[9] = new Question("Berilgan satr ichida  berilgan boshqa satr nechinchi indeksda ekanligini aniqlovchi String classini funksiyasi?" , "indexOf()");
        questions[10] = new Question("Berilgan satr ichida berilgan boshqa satr oxirgi indeksini topadigan String classini funksiyasi?" , "lastIndexOf()");
        questions[11] = new Question("Berilgan satr uzunligini aniqlovchi String classini funksiyasi?" , "length()");
        questions[12] = new Question("Berilgan satrdagi barcha harflarni kichik harflarga o'zgartiruvchi String classini funksiyasi?" , "toLowerCase()");
        questions[13] = new Question("Berilgan satrdagi barcha  harflarni kattasiga almashtiruvchi String classini funksiyasi?" , "toUpperCase()");
        questions[14] = new Question("Berilgan satrdagi berilgan indeksdagi  belgini oladigan String classini funksiyasi?" , "charAt()");
        questions[15] = new Question("Berilgan satrni bo'shligini tekshiriuvchi String classini funksiyasi?" , "isEmpty()");
        questions[16] = new Question("Berilgan satrga berilgan satr qismini o'rniga berilgan satrni joylashtiruvchi String classini funksiyasi?" , "replace()");
        questions[17] = new Question("Berilgan satrga berilgan satr qismini(barchasini) o'rniga berilgan boshqa satrni joylashtiradigan String classini funksiyasi?" , "replaceAll()");
        questions[18] = new Question("Berilgan satrga berilgan satr qismini o'rniga berilgan satrni joylashtiruvchi (faqat 1-o'rniga)String classini funksiyasi?" , "replaceFirst()");
        questions[19] = new Question("Berilgan satrni belgilar massiviga aylantiruvchi String classini funksiyasi?" , "toCharArray()");
        questions[20] = new Question("Berilgan satrdagi ortiqcha bo'sh joylarni yo'qotuvchi String classini funksiyasi?" , "trim()");

        examer(questions);
    }

    public void questionsMath(){
        Question[] questions = new Question[22];

        questions[0] = new Question("Berilgan sonlardan kattasini aniqlab beruvchi funksiya?" , "max()");
        questions[1] = new Question("Berilgan sonlardan kichigini aniqlab beruvchi funksiya?" , "min()");
        questions[2] = new Question("Berilgan sonning absolyut qiymatini qaytaruvchi funksiya?" , "abs()");
        questions[3] = new Question("To'g'ri burhchakli uchburchakning katetlari berilgan holda uning gipotenuzasini hisoblovchi funksiya?" , "hypot()");
        questions[4] = new Question("Sonning kvadrat ildizini hisoblovchi funksiya?" , "sqrt()");
        questions[5] = new Question("Berilgan a sonning b - darajasini hisoblovchi funksiya? " , "pow()");
        questions[6] = new Question("Berilgan sonni yaxlitlab beruvchi funksiya?" , "round()");
        questions[7] = new Question("Berilgan sonni ishorasini qaytaruvchi funksiya(0 < bo'lsa -1 qaytaradi)?" , "signum()");
        questions[8] = new Question("Arcsin ni hisoblovchi funksiya ?" , "asin()");
        questions[9] = new Question("Arccos ni hisoblovchi funksiya ? " , "acos()");
        questions[10] = new Question("Arctg ni hisoblovchi funksiya ? " , "atan()");
        questions[11] = new Question("Berilgan sonni 3 - darajali ildizini hisoblovchi funksiya ? " , "cbrt()");
        questions[12] = new Question("cos ni hisoblovchi funksiya ? " , "cos()");
        questions[13] = new Question("sin ni hisoblovchi funksiya ?" , "sin()");
        questions[14] = new Question("tg ni hisoblovchi funksiya ? " , "tan()");
        questions[15] = new Question("2 asosga ko'ra sonning logarifmini hisoblovchi funksiya ? " , "log()");
        questions[16] = new Question("10 asosga ko'ra sonning logarifmini hisobloovchi funksiya ? " , "log10()");
        questions[17] = new Question("0 va 1 oraliqdan ixtiyor sonni tanlovchi funksiya ?" , "random()");
        questions[18] = new Question("Radianda berilgan sonni graduslarga o'tkazuvchi funksiya ?" , "toDegrees()");
        questions[19] = new Question("Graduslarda berilgan sonni radianlarda ifodalab beruvchi funksiya ?" , "toRadians()");
        questions[20] = new Question("O'zgarmas e sonini qiymatini qaytaruvchi math classining o'zgaruvchisi ? " , "E");
        questions[21] = new Question("O'zgarmas pi sonini qiymatini qaytaruvchi math classining o'zgaruvchisi ? " , "PI");

        examer(questions);
    }

    public void examer(Question[] questions){
        System.out.println("O'yinimizni boshlaymiz!!!Faqat e'tiborli bo'ling hamma funksiyalar oxirida qavs bo'lishi kerak!!!");
        int i = 0;
        int ball = 0;
        while (true){
            int n = random.nextInt(questions.length);
            System.out.println(((i++)+1) + ".Savol : " + questions[n].getQuestion());
            System.out.print("Javob : ");
            String answer = scanner.next();
            if (questions[n].isTrue(answer)){
                ball++;
                System.out.println("Javobingiz to'g'ri :) !!! Sizning balingiz : " + ball);

            }else{
                ball--;
                System.out.println("Xato javob!!! Sizdan bir ball olinadi :( !!! Hozirgi balingiz : " + ball);
            }

        }
    }


}
