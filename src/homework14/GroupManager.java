package homework14;

import homework10.bookShop.Book;

import java.util.Arrays;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework14
 * Class Name -> GroupManager
 * Copyright © : 9/16/2022
 */
public class GroupManager {
    private User[] users;
    private int userCount;
    private Group[] groupsArray;
    private int groupCount;

    public GroupManager() {
        groupsArray = new Group[10];
        users=new User[10];
    }

    private MessageInterface messageInterface;

    public void setManagerListener(MessageInterface listener) {
        messageInterface = listener;
    }

    private class Group {
        private int count;
        private String groupName;//gruhni Nomi
        private int capacity;//guruh Sigimi
        private User[] usersArray;////guruhdi Massivi

        public Group(String groupName, int capacity) {
            this.groupName = groupName;
            this.capacity = capacity;
            usersArray = new User[capacity];
        }

        public boolean checkGroupUser(User user) {//Husanhon
            if (count == 0) return false;
            for (int i = 0; i < count; i++) {
                if (usersArray[i].toString().equals(user.toString())) {//hamma 3 ta oti familyasi yoshini equals qivoradi toStrin
                    return true;
                }
            }
            return false;
        }

        public void addGroupUsers(User user) {
            if (count == capacity) {
                System.out.println("Group is Full");
                return;
            }
            usersArray[count++] = user;
        }

        public void removeGroupUser(User user) {
            if (count == 0) {
                return;
            }
            if (checkGroupUsers(user) == -1) return;
            int position = checkGroupUsers(user);
            usersArray[position] = usersArray[--count];
        }

        public int checkGroupUsers(User user) {//Husanhon
            if (count == 0) return -1;
            for (int i = 0; i < count; i++) {
                if (usersArray[i].toString().equals(user.toString())) {//hamma 3 ta oti familyasi yoshini equals qivoradi toStrin
                    return i;
                }
            }
            return -1;
        }

        public boolean isFull() {
            return count == capacity;
        }
    }

    public void createGroup(String groupName, int capacityGroup) {
        if (groupsArray.length == groupCount) {
            groupsArray = ArrayListResize(groupsArray);
        }
        if (checkGroup(groupName) != -1) {
            messageInterface.showMessage("Group is Have");//ekranga chiqish natijasi
            return;
        }
        Group group = new Group(groupName, capacityGroup);
        groupsArray[groupCount++] = group;
        messageInterface.showMessage("Group is Opened");//guruh ochilib boldi !
    }

    private int checkGroup(String groupName) {
        if (groupCount == 0) return -1;//hali umuman GURH mavjud bolmagan !
        for (int i = 0; i < groupCount; i++) {
            if (groupsArray[i].groupName.equals(groupName)) {
                return i;//GURUH mavjud
            }
        }
        return -1;//GURUH mavjud emas !
    }

    public void deleteGroup(String groupNameForDelete) {
        if (checkGroup(groupNameForDelete) == -1) {
            messageInterface.showMessage("Group is not Found");
            return;
        }
        int position = checkGroup(groupNameForDelete);//1
        groupsArray[position] = groupsArray[--groupCount];//
        //1=
    }

    private Group[] ArrayListResize(Group[] array) {
        Group[] objects = new Group[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            objects[i] = array[i];
        }
        return array = objects;
    }
    private User[] ArrayListResize(User[] array) {
        User[] objects = new User[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            objects[i] = array[i];
        }
        return array = objects;
    }

    public void addUserFromGroup(String addGroupName, User addUser) {
        if (checkGroup(addGroupName) == -1) {
            messageInterface.showMessage("Gropu is not Found");
            return;
        }
        int position = checkGroup(addGroupName);//guruhdi topib oldik
        Group gg = groupsArray[position];
        if (gg.checkGroupUser(addUser)) {
            messageInterface.showMessage("User is not Add");
            return;
        }
        if (gg.isFull()) {
            messageInterface.showMessage("Group Users is Full");
            return;
        }
        gg.addGroupUsers(addUser);

    }

    public void removeUserFromGroup(String groupName, User removeUser) {
        if (checkGroup(groupName) == -1) {
            messageInterface.showMessage("Gropu is not Found");
            return;
        }
        int position = checkGroup(groupName);//guruhdi topib oldik
        Group gg = groupsArray[position];
        if (gg.checkGroupUser(removeUser)) {
            messageInterface.showMessage("User is not Add");
            return;
        }
        if (gg.isFull()) {
            messageInterface.showMessage("Group Users is Full");
            return;
        }
        gg.removeGroupUser(removeUser);

    }

    void getUserOfManyGroup() {
        for (int i = 1; i < groupCount; i++) {
            for (int j = 0; j < groupsArray[i].count; j++) {
                if (groupsArray[i - 1].checkGroupUser(groupsArray[i].usersArray[j])) {
                    if (users.length==userCount)users=ArrayListResize(users);
                    users[userCount++] = groupsArray[i].usersArray[j];
                }
            }

        }
        for (int i = 0; i < userCount; i++) {//4
            User element = users[i];
            boolean mavjud = false; //
            for (int j = 0; j < i; j++) {
                mavjud = mavjud || element.toString().equals(users[j].toString());
            }
            if (!mavjud) {
                messageInterface.showMessage(element.toString());
            }
        }
    }
}
