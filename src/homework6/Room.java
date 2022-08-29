package homework6;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework6
 * Class Name -> Room
 * Copyright © : 8/29/2022
 */
public class Room {
    int count;
    Student[] students;
    public Room(int _sum) {
        students=new Student[_sum];
    }

    public void add(Student s) {

        if (isFull()) {
            System.out.println("Xonaga  bundan ortiq talaba sig`maydi");
            return;
        }
        students[count++]=s;
        }


    public void show() {
        for (int i = 0; i < count; i++) {
            System.out.println("======================="+(i+1)+"========================");
            System.out.println("Student Name:"+students[i].getName());
            System.out.println("Student Age:"+students[i].getAge());
            System.out.println("=========================================================");
        }

    }

    public boolean isFull() {
        return count ==students.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

}
