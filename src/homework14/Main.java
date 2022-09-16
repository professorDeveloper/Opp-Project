package homework14;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework14
 * Class Name -> Main
 * Copyright © : 9/15/2022
 */
public class Main {
    public static void main(String[] args) {
        GroupManager groupManager =new GroupManager();
        groupManager.setMessageListener(new MessageInterface() {
            @Override
            public void showMessage(String message) {
                System.out.println(message);
            }
        });
        User user=new User("Robert","Down",20);
        User user2=new User("Daniel","Defo",16);
        User user3=new User("Jack","Atkinson",31);
        groupManager.addGroup("Bootcamp4",27);
        groupManager.addGroup("BootcampChat",2);
        groupManager.addGroup("BootcampChats",2);
        groupManager.addGroup("MyCode",7);
        groupManager.addUserToGroup("MyCode",user);
        groupManager.addUserToGroup("MyCode",user2);
        groupManager.addUserToGroup("MyCode",user3);
        groupManager.addUserToGroup("BootcampChat",user3);
        groupManager.addUserToGroup("BootcampChat4",user3);
        groupManager.addUserToGroup("Bootcamp4",user3);
        groupManager.addUserToGroup("BootcampChats",user);
        groupManager.getUserOfManyGroup();
    }
}
