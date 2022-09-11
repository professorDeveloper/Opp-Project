package masalaMoneyBox;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> masalaMoneyBox
 * Class Name -> MoneyBox
 * Copyright © : 9/5/2022
 */
public class MoneyBox {
    int count;
    Money[] moneyList;
    private int countMoney;
    private int allMoneySize;

    public MoneyBox(int counts) {
        this.count = counts;
        moneyList = new Money[counts];
    }

    public boolean addMoney(Money money) {
        if (!isFully()) {
            moneyList[countMoney++] = money;
            allMoneySize += money.getPrice();
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return countMoney == 0;
    }

    public boolean isFully() {
        return countMoney >= count;
    }

    public int getMoneyCount() {
        return countMoney;
    }

    public int getAmount() {
        return allMoneySize;
    }

}
