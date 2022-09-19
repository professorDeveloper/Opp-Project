package imtihon;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> imtihon
 * Class Name ->
 * Copyright © : 9/16/2022
 */
public class Imtihon {
    public static void main(String[] args) {
        RegisterController reg = new RegisterController(10);
        reg.logListener(new LogInterface() {
            @Override
            public void showMessage(String message) {
                System.out.println(message);
            }
        });
        reg.setUserListener(new UserDataInterface() {
            @Override
            public void show(UserData user) {
                user.showInfo();
            }
        });
        Scanner sc = new Scanner(System.in);
        UserData user1 = new UserData("Husanxon", 18, "+998992803809");
        UserData user2 = new UserData("Husanxon", 13, "+9989928038091");
        reg.register(user1);
        System.out.print("Kodni kiriting: ");
        reg.checkSmsCode(user1.getPhoneNumber(), sc.nextInt());
        reg.getAllUsers();
        reg.repeatSmsCode(user1);


    }
}


class UserData {
    private String name;
    private int age;
    private String phoneNumber;


    public UserData(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void showInfo() {
        System.out.println("Ism: " + name + " || " + "Yosh: " + age + " || " + "Telefon Raqam: " + phoneNumber);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

interface LogInterface {
    void showMessage(String message);
}

interface UserDataInterface {
    void show(UserData user);
}

class RegisterController {
    private LogInterface logListener;
    private UserDataInterface userListener;
    private int maxRegister;
    private UserData[] userArrayRegistered;
    private UserData[] userArrayUnRegistered;
    private int countUnRegistered;
    private int countRegsitered;
    private int[] codeArray;

    public RegisterController(int maxRegister) {
        this.maxRegister = maxRegister;
        userArrayRegistered = new UserData[maxRegister];//d1lshod
        userArrayUnRegistered = new UserData[10];
        codeArray = new int[10];
    }

    public void register(UserData user) {
        if (!isUserRegistered(userArrayRegistered, countRegsitered, user) && isUserRegistered(userArrayUnRegistered, countUnRegistered, user)) {
            logListener.showMessage("User Avvaldan mavjud !");
            return;
        }
        check(user);

    }

    public void setUserListener(UserDataInterface userListener) {
        this.userListener = userListener;
    }

    private boolean isUserRegistered(UserData[] userDataList, int count, UserData user) {
        for (int i = 0; i < count; i++) {
            if (userDataList[i].getPhoneNumber().equals(user.getPhoneNumber())) {
                return true;
            }
        }
        return false;
    }

    private void check(UserData userDate) {
        if (!(checkName(userDate.getName()) &&
                userDate.getName().length() > 3 &&
                userDate.getName().length() < 12 &&
                checkPhone(userDate.getPhoneNumber()) &&
                userDate.getAge() >= 16 &&
                userDate.getAge() <= 25)) {
            logListener.showMessage("User not correct");
            return;
        }
        userArrayUnRegistered[countUnRegistered] = userDate;
        sendSmsCode(userDate.getPhoneNumber());
    }

    private void sendSmsCode(String phoneNumber) {
        Random random = new Random();
        int randomNumber = random.nextInt(8999) + 1000;
        if (codeArray.length == countUnRegistered) {
            codeArray = resize(codeArray);
            userArrayUnRegistered = resizeArray(userArrayUnRegistered);
        }
        codeArray[countUnRegistered++] = randomNumber;
        logListener.showMessage("Your code: " + randomNumber);
    }

    private boolean checkName(String userName) {//Dil1shod
        String replaceName = userName.replaceAll("[a-zA-Z]", "");
        return replaceName.length() == 0;
    }

    private boolean checkPhone(String userPhoneNumber) {
        return userPhoneNumber.matches("^(\\+998|998)(90|91|93|94|95|97|98|99|88)\\d{7}$");
    }

    public void logListener(LogInterface _logInterface) {
        logListener = _logInterface;
    }

    public UserData[] resizeArray(UserData[] userArrayUnRegistered) {
        UserData[] size = new UserData[userArrayUnRegistered.length + userArrayUnRegistered.length / 2];
        for (int i = 0; i < userArrayUnRegistered.length; i++) {
            size[i] = userArrayUnRegistered[i];
        }
        return size;//referenc ketdi
    }

    private int[] resize(int[] size) {
        int[] a = new int[size.length + size.length / 2];
        for (int i = 0; i < size.length; i++) {
            a[i] = size[i];
        }
        return size;//referenc ketdi
    }

    public void checkSmsCode(String phoneNumber, int code) {
        int index = checkUserPhoneNumber(phoneNumber, countUnRegistered, userArrayUnRegistered);
        if (index == -1) {
            logListener.showMessage("User Topilmadi !");
            return;
        }

        if (codeArray[index] != code) {
            logListener.showMessage("Code is not Correct !");
            return;
        }
        if (countUnRegistered == maxRegister) {
            logListener.showMessage("User is Full !");
            return;
        }
        userArrayRegistered[countRegsitered++] = userArrayUnRegistered[index];
        logListener.showMessage("User is Registered Successfully");
        countUnRegistered--;
        userArrayUnRegistered[index] = userArrayUnRegistered[countUnRegistered];
        codeArray[index] = codeArray[countUnRegistered];

    }

    private int checkUserPhoneNumber(String phoneNumber, int count, UserData[] userDateArray) {//
        for (int i = 0; i < count; i++) {
            if (Objects.equals(phoneNumber, userDateArray[i].getPhoneNumber())) {
                return i;
            }
        }
        return -1;
    }

    public void repeatSmsCode(UserData userDate) {
        if (!isUserRegistered(userArrayUnRegistered, countRegsitered, userDate)) {
            logListener.showMessage("Bunday User topilmadi !");
            return;
        }
        Random rnadom = new Random();

        int randomNumber = rnadom.nextInt(8999) + 1000;
        int index = checkUserPhoneNumber(userDate.getPhoneNumber(), countUnRegistered, userArrayUnRegistered);
        if (index == -1) {
            logListener.showMessage("User Topilmadi !");
            return;
        }
        codeArray[index] = randomNumber;

        logListener.showMessage("New code:" + randomNumber);


    }// 0=h 1=j 2=j<-t

    public void getAllUsers() {
        for (int i = 0; i < countRegsitered; i++) {
            System.out.println("=====================================================================");
            userListener.show(userArrayRegistered[i]);
            System.out.println("=====================================================================");
        }
    }

    public void unRegister(UserData userDate) {
        if (!isUserRegistered(userArrayRegistered, countRegsitered, userDate)) {
            logListener.showMessage("Bunday user Yo`q");
            return;
        }
        int position = checkUserPhoneNumber(userDate.getPhoneNumber(), countRegsitered, userArrayRegistered);
        countRegsitered--;
        userArrayRegistered[position] = userArrayRegistered[countRegsitered];
        logListener.showMessage("Muvaffaqiyatli o`chirildi !");
    }

}

