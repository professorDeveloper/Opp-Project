package homework14;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework14
 * Class Name -> User
 * Copyright © : 9/16/2022
 */
public class User {
    private  String firstName;
    private  String lastName;

    private  int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
