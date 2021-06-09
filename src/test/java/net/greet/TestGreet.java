package net.greet;


import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestGreet {

    @org.junit.jupiter.api.Test
    public void shouldBeAbleToGreetInIsixhosa() {
        Greeting greeting = new Greeting();
        greeting.greet("Sino", "isixhosa");
        greeting.greet("Sino", "isixhosa");
        assertEquals(1, greeting.greetedUser(Collections.singletonList("Sino"), "Sino"));
    }

    @org.junit.jupiter.api.Test
    public void shouldBeAbleToGreetInIsizulu() {
        Greeting greeting = new Greeting();
        greeting.greet("Andre", "isizulu");
        greeting.greet("Unalo", "isizulu");
        assertEquals(0, greeting.greetedUser(Collections.singletonList("Andre"), "Unalo"));
    }

    @org.junit.jupiter.api.Test
    public void shouldBeAbleToGreetInSesotho() {
        Greeting greeting = new Greeting();
        greeting.greet("Bee", "sesotho");
        greeting.greet("Lulu", "sesotho");
        greeting.greet("Kat", "sesotho");
        assertEquals(0, greeting.greetedUser(Collections.singletonList("Bee"), "Lulu"), "Kat");
    }

    @org.junit.jupiter.api.Test
    public void shouldBeAbleToGreetInDefaultLanguage() {
        Greeting greeting = new Greeting();
        greeting.greet("Chuma", "");
        greeting.greet("Lisa", "");
        greeting.greet("Khosi", "");
        assertEquals(0, greeting.greetedUser(Collections.singletonList("Chuma"), "Lisa"), "Khosi");
    }


    @org.junit.jupiter.api.Test
    public void shouldBeAbleToGreetUsersAndShowTheirCount() {
        Greeting greeting = new Greeting();
        greeting.greet("Sivu", "isixhosa");
        greeting.greet("Lebo", "isizulu");
        assertEquals(2, greeting.users.size());
   }


        @org.junit.jupiter.api.Test
    public void shouldBeAbleToRemoveUserInfo() {
        Greeting greeting = new Greeting();
        greeting.greet("Sivu", "isixhosa");
        greeting.greet("Sino", "");
        //greeting.removeUser();
        assertEquals(1, greeting.removeUser(), greeting.users.size());
   }

}


