package masalaMoneyBox;

import util.TestUtil;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> masalaMoneyBox
 * Class Name -> main
 * Copyright © : 9/5/2022
 */
public class Main {
    public static void main(String[] args) {
        long lastTime = System.currentTimeMillis();

        MoneyBox box = new MoneyBox(5);

        TestUtil.assertEquals(box.isEmpty(), true);
        TestUtil.assertEquals(box.isFully(), false);
        TestUtil.assertEquals(box.addMoney(new Money(500)), true);
        TestUtil.assertEquals(box.isEmpty(), false);
        TestUtil.assertEquals(box.getMoneyCount(), 1);
        TestUtil.assertEquals(box.getAmount(), 500);
        TestUtil.assertEquals(box.addMoney(new Money(1500)), true);
        TestUtil.assertEquals(box.getAmount(), 2000);
        TestUtil.assertEquals(box.addMoney(new Money(1500)), true);
        TestUtil.assertEquals(box.addMoney(new Money(1500)), true);
        TestUtil.assertEquals(box.addMoney(new Money(1500)), true);
        TestUtil.assertEquals(box.getMoneyCount(), 5);
        TestUtil.assertEquals(box.getAmount(), 6500);
        TestUtil.assertEquals(box.addMoney(new Money(1500)), false);
        TestUtil.assertEquals(box.getAmount(), 6500);
        TestUtil.assertEquals(box.getMoneyCount(), 5);

        System.out.println("Run time: " + (System.currentTimeMillis() - lastTime) + " ms");
    }
}
