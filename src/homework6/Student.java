package homework6;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework6
 * Class Name -> Student
 * Copyright © : 8/29/2022
 */
public class Student {
    String name;
    int age;

    public Student(String _name, int _age) {
        if (_name.length() < 3 || _age < 16) {
            System.out.println("Maydon Hato kiritildi !");
            return;
        }
        name = _name;
        age = _age;
    }

    public String getName() {
         return name;
    }

    // TODO: 8/29/2022 Hi bro
    public int getAge() {
        return age;
    }
}
