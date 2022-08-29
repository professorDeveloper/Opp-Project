package homework5;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework5
 * Class Name -> Task5
 * Copyright © : 8/27/2022
 */
public class homework5 {
    public static void main(String[] args) {
        MyCosts myCosts = new MyCosts("Hud azamov", 100);
        myCosts.showInfo();
        myCosts.addMoney(10);
        myCosts.showInfo();
        myCosts.spendMoney(20);
        myCosts.showInfo();
        System.out.println(myCosts.getMoney());
        System.out.println("======================================================");
        MathAssistant mathAssistant = new MathAssistant(10);
        System.out.println(mathAssistant.pow(10));
        System.out.println(mathAssistant.sumDigits());
        System.out.println("============================================================");
        MakerIceCream makerIceCream = new MakerIceCream(133, 33);
        makerIceCream.showInfo();
        makerIceCream.addMilk(10);
        makerIceCream.addSugar(10);
        System.out.println("====================================");
        makerIceCream.showInfo();
        makerIceCream.makeIceCream(3, 3, 10);
        System.out.println(makerIceCream.maxIceCreamCount(3, 5));
        Assistant assistant = new Assistant();
        System.out.println("===================================================");
        System.out.println(assistant.getWholeSection(-5.5));
        System.out.println("===================================================");
        System.out.println(assistant.abs(5));
        System.out.println("===================================================");
        System.out.println(assistant.addNumber(5, 3));
        System.out.println("===================================================");
        System.out.println(assistant.pow(3, 4));
        System.out.println("===================================================");
        Kasr kasr=new Kasr(3,6);
        Kasr kasr2=new Kasr(4,5);
        System.out.println("========================================");
        kasr.addTwoKasr(kasr,kasr2);
        kasr.multiplyTwoKasr(kasr,kasr2);
        kasr.divisionTwoKasr(kasr,kasr2);
        kasr.showInfo();

    }
}

class MyCosts {
    String username;
    int money;

    public MyCosts(String _username, int _money) {
        username = _username;
        money = _money;
    }

    void showInfo() {
        System.out.println("Username:" + username);
        System.out.println("Money: " + money);
    }

    int getMoney() {
        return money;
    }

    void spendMoney(int spend) {
        money -= spend;
    }

    void addMoney(int addSum) {
        money += addSum;
    }
}

class MathAssistant {
    int number;

    MathAssistant(int _number) {
        number = _number;
    }

    public int pow(int degree) {
        int x = 1;
        for (int i = 0; i < degree; i++) {
            x += number;
        }
        return x;
    }

    public int sumDigits() {
        int n = number;
        int s = 0;
        if (n < 10) return n;
        else {
            while (n > 10) {
                s += n % 10;
                n /= 10;
            }
        }
        return n;

    }

}

class MakerIceCream {
    private int milk;
    private int sugar;

    public MakerIceCream(int milk, int sugar) {
        this.milk = milk;//10
        this.sugar = sugar;
    }

    public void addMilk(int milk) {
        this.milk += milk;
    }

    public void addSugar(int sugar) {
        this.sugar += sugar;
    }

    public int maxIceCreamCount(int milk, int sugar) {//1
        int milks = this.milk / milk;
        int sugars = this.sugar / sugar;
        return Math.min(milks, sugars);
    }

    public void showInfo() {
        System.out.println("Milk: " + milk);
        System.out.println("Sugar: " + sugar);
    }

    public void makeIceCream(int milk, int sugar, int count) {
        if (this.milk >= milk * count && this.sugar >= sugar * count) {
            this.milk -= milk * count;
            this.sugar -= sugar * count;
            showInfo();
        } else System.out.println("Not enough");
    }
}

class Assistant {
    int addNumber(int a, int b) {
        return a + b;
    }

    int pow(int a, int b) {
        int c = 1;
        for (int i = 0; i < b; i++) {
            c *= a;
        }
        return c;
    }

    int abs(int a) {
        if (a > 0) {
            a *= -1;
            return a;
        } else {
            return 0;
        }
    }

    int getWholeSection(double a) {
        if (a >= 0) return (int) a;
        return (int) a - 1;
    }
}

class Kasr {
    private int surat;
    private int maxraj;

    public Kasr(int surat, int maxraj) {
        this.surat = surat;
        this.maxraj = maxraj;
    }
    public void showInfo(){
        System.out.println(surat + "/" + maxraj);
    }

    private int ekub (int a, int b){
        int ga = 0;
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            ga = a % b;
            a = b;
            b = ga;
        }
        return a;
    }
    private Kasr reduction (Kasr kasr){
        int a = kasr.surat;
        int b = kasr.maxraj;
        int g = 0;
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            g = a % b;
            a = b;
            b = g;
        }
        kasr.surat /= a;
        kasr.maxraj /= a;
        return kasr;
    }

    void addTwoKasr(Kasr a , Kasr b){
        int ekuk = a.maxraj * b.maxraj / ekub(a.maxraj,b.maxraj); // a*b = EKUB(a,b) * EKUK(a,b)
        Kasr kasr = new Kasr((ekuk / a.maxraj) * a.surat + (ekuk / b.maxraj) * b.surat , ekuk);

        reduction(kasr).showInfo();
    }

    void multiplyTwoKasr(Kasr a, Kasr b){
        Kasr kasr = new Kasr(a.surat * b.surat,a.maxraj * b.maxraj);
        reduction(kasr).showInfo();
    }
    void divisionTwoKasr(Kasr a, Kasr b){
        Kasr kasr = new Kasr(a.surat * b.maxraj, b.surat * a.maxraj);
        reduction(kasr).showInfo();
    }
}