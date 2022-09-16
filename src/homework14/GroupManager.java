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
    private MessageInterface messageInterface;
    private Group[] groups;
    private User[] users;
    private int count;
    private int userCount;

    GroupManager() {
        groups = new Group[10];
        users = new User[10];
    }

    void setMessageListener(MessageInterface messageListener) {
        messageInterface = messageListener;
    }

    void addGroup(String groupName, int capacity) {
        if (count == groups.length) {
            groups = resizeArray(groups);
        }
        Group group = new Group(groupName, capacity);
        int currentPosition = checkGroup(groupName);
        if (currentPosition != -1) {
            messageInterface.showMessage("Bunday guruh mavjud");
            return;
        }
        messageInterface.showMessage("Guruh ochildi !");
        groups[count++] = group;

    }

    void deleteGroup(String groupName) {
        int position = checkGroup(groupName);
        if (count == 0) messageInterface.showMessage("Guruhlar Ro`yhati bo`sh !");
        if (position > -1) {
            groups[position] = groups[--count];
            messageInterface.showMessage("Guruh o`chirildi !");
        }
        messageInterface.showMessage("Guruh mavjud emas");
    }

    void getUserOfManyGroup() {
        for (int i = 1; i < count; i++) {
            for (int j = 0; j < groups[i].count; j++) {
                if (groups[i - 1].checkUser(groups[i].users[j])) {
                    if (users.length==userCount)users=resizeArray(users);
                    users[userCount++] = groups[i].users[j];
                }
            }

        }
        for (int i = 0; i < userCount; i++) {
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

    void addUserToGroup(String groupName, User user) {
        int groupPosition = checkGroup(groupName);
        if (groupPosition == -1) {
            messageInterface.showMessage("Guruh Toplimadi !");
            return;


        }
        Group group = groups[groupPosition];
        if (!group.hasStead()) {
            messageInterface.showMessage("Guruhda joy mavjud emas !");
            return;
        }
        if (group.checkUser(user)) {
            messageInterface.showMessage("User oldindan Mavjud !");
            return;
        }
        group.addUser(user);
    }

    void removeUserToGroup(String groupName, User user) {
        int groupPosition = checkGroup(groupName);
        if (groupPosition == -1) {
            messageInterface.showMessage("Guruh Toplimadi !");
            return;
        }
        Group group = groups[groupPosition];
        if (!group.hasStead()) {
            messageInterface.showMessage("Guruhda joy mavjud emas !");
            return;
        }
        if (group.checkUser(user)) {

            messageInterface.showMessage("User O`chirildi !");
            group.removeUser(user);
            group.count--;
            return;
        }
        messageInterface.showMessage("User Topilmadi");
    }


    private Group[] resizeArray(Group[] array) {
        Group[] objects = new Group[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            objects[i] = array[i];
        }
        return array = objects;//referenc ketdi
    }
    private User[] resizeArray(User[] array) {
        User[] objects = new User[array.length + array.length / 2];
        for (int i = 0; i < array.length; i++) {
            objects[i] = array[i];
        }
        return array = objects;//referenc ketdi
    }

    private int checkGroup(String groupName) {
        for (int i = 0; i < count; i++) {
            if (groups[i].name.equals(groupName)) {
                return i;
            }
        }
        return -1;
    }

    private class Group {
        private String name;
        private int capacity;
        private User[] users;
        private int count;

        public Group(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
            users = new User[capacity];
        }

        @Override
        public String toString() {
            return name;
        }

        public boolean hasStead() {
            return count != capacity;
        }

        public boolean checkUser(User user) {
            for (int i = 0; i < count; i++) {
                if (users[i].toString().equals(user.toString())) {
                    return true;
                }
            }
            return false;
        }

        public void addUser(User user) {
            users[count++] = user;
        }

        public void removeUser(User user) {
            int position = 0;
            for (int i = 0; i < count; i++) {
                if (!users[i].toString().equals(user.toString())) {
                    return;
                } else {
                    position = i;
                }

            }
            users[position] = users[--count];
        }
    }

}
