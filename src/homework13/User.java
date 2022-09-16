package homework13;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework12
 * Class Name -> User
 * Copyright © : 9/14/2022
 */
public class User {
    //All final attributes
    private String firstName;   // required
    private String lastName;   // required
    private String phone;     // optional
    private String bio;      // optional
    private  int age;

    private int code;


    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phone = builder.phone;
        this.bio = builder.bio;
        this.age=builder.age;
        this.code=builder.code;
    }

    public int getCode() {
        return code;
    }

    public String getBio() {
        return bio;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }


    public static class UserBuilder {
        private String bio;
        private int age;
        private String firstName;
        private String lastName;
        private String phone;
        private int code;

        public UserBuilder(String phone, int code) {
            this.phone = phone;
            this.code = code;
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public UserBuilder bio(String bio) {
            this.bio = bio;
            return this;
        }
        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;

            return this;
        }
        public UserBuilder age(int age) {
            this.age=age;
            return this;
        }
        public User build() {
            return new User(this);
        }

    }
}