package net.greet;

import java.util.*;


public class Greeting implements Greetings {
    /*
    greet = username + language to greet in
    greeted = all greeted users + time each has been greeted
    counter = list of unique users
    clear = deletes greetings + user info. clear + name deletes counter for the user
    remove= deletes the a specific user and decrement the count by 1
    exit = exits app
    */
    public Boolean exit = true;
    public List language = new ArrayList<String>();
    public List users = new ArrayList<String>();
    public List newUserList = new ArrayList();

    String userLanguage;
    Scanner s = new Scanner(System.in);


    //THE METHODS

    public void help(){
        System.out.println("1. greet 'greet [name] [language]' " +
                "\n2. check who's been greeted 'greeted' or 'greeted [name]' " +
                "\n3. remove user 'remove [user]' " +
                "\n4. clear the guest list 'clear' " +
                "\n5. count numbers of greeted people 'count'" +
                " \n6. leave programme 'exit'");

    }


    public void greet(String name, String lan) {
        addUsers(name);
        switch (lan) {
            case "isixhosa":
                System.out.println("Mholo, " + name);
                break;
            case "isizulu":
                System.out.println("Sawubona, " + name);
                break;
            case "sesotho":
                System.out.println("Dumela, " + name);
                break;
            default:
                System.out.println("Hello, " + name);
        }
    }

    @Override
    public void addUsers(String user ){
        users.add(user);
        }

    @Override
    public int greetedUser(List allUsers, String userName) {
        int i = 0;
        int counter = 0;

        while (i < allUsers.size()) {
            if (allUsers.get(i).toString().equals(userName)) {
                counter += 1;
            }
            i += 1;
        }

        return counter;
    }

    @Override
    public void greetedAll(List myUsers) {
        HashSet<String> uniqueUsers = new HashSet<>(myUsers);
        for (String user : uniqueUsers) {
            newUserList.add(user);
          //  System.out.println(myUsers);
        }

        if (newUserList.size() > 0) {
            int j = 0;
            while (j < newUserList.size()) {
//            System.out.println();
                System.out.println(newUserList.get(j).toString() + " has " + greetedUser(myUsers, newUserList.get(j).toString()) + " appearance(s).");
                j += 1;
            }
        } else {
            System.out.println("no greetings have been logged");
        }
        newUserList.clear();
    }

    @Override
    public int counter(List themUsers) {
        HashSet<String> uniqueUsers = new HashSet<>(themUsers);
        for (String user : uniqueUsers) {
            newUserList.add(user);
        }
        System.out.println("There are " + newUserList.size() + " greeted user(s).");
        return  users.size();
    }

    @Override
    public int removeUser(){
        HashSet<String> uniqueUsers = new HashSet<String>();
        for (String user : uniqueUsers) {
            boolean isremoved = uniqueUsers.remove(user);
        }

        return users.size();
    }


    public boolean exit() {
        return exit = false;
    }
}