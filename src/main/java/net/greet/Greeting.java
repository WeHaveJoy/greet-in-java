package net.greet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


public class Greeting {
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
        switch (lan) {
            case "isixhosa":
                addUsers(name);
                System.out.println("Mholo, " + name);
                break;
            case "isizulu":
                addUsers(name);
                System.out.println("Sawubona, " + name);
                break;
            case "sesotho":
                addUsers(name);
                System.out.println("Dumela, " + name);
                break;
            default:
                addUsers(name);
                System.out.println("Hello, " + name);
        }
    }

    public void addUsers(String user ){
        if((!users.contains(user))){
            users.add(user);
        }
    }

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

    public void greetedAll(List myUsers) {
        HashSet<String> uniqueUsers = new HashSet<>(myUsers);
        for (String user : uniqueUsers) {
            newUserList.add(user);
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

    public int counter(List themUsers) {
        HashSet<String> uniqueUsers = new HashSet<>(themUsers);
        for (String user : uniqueUsers) {
            newUserList.add(user);
        }
        System.out.println("There are " + newUserList.size() + " greeted user(s).");
        // newUserList.clear();
        return  users.size();
    }

    public int removeUser(){
        HashSet<String> uniqueUsers = new HashSet<String>();
        for (String user : uniqueUsers) {
            boolean isremoved = uniqueUsers.remove(user);
        }

        return users.size();
    }

    boolean exit() {
        return exit = false;
    }
}