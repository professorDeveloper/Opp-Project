package questionsHomework9;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> questionsHomework9
 * Class Name -> Test
 * Copyright © : 9/6/2022
 */
public class Test {
    private int maximal;
    private Questions[] questionsArray;
    private boolean isActive;
    private int count;

    public Test(int maximal) {
        this.maximal = maximal;
        questionsArray = new Questions[maximal];
    }

    public boolean addQuestion(Questions questions) {
        if (isFull()) return false;
        questionsArray[count++] = questions;
        return true;

    }

    public boolean start() {
        if (isActive) return false;
        else {
            isActive = true;
            return true;
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == maximal;
    }
}
