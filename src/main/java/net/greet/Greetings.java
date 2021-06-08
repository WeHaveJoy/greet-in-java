package net.greet;

import java.util.List;

public interface Greetings {

 //   void  help();

    //void greet(String name, String lan);

    void addUsers(String user );

    int greetedUser(List allUsers, String userName);

    void  greetedAll(List myUsers);

    int removeUser();

    int counter(List themUsers);

   // boolean exit();


}
