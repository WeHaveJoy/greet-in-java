package net.greet;

import net.greet.Greeting;
import net.greet.Greeting;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class test {
    @Test
    public void shouldBeAbleToGreetInIsixhosa() {
        Greeting greeting = new Greeting();
        greeting.greet("Sino", "isixhosa");
        greeting.greet("Sino", "isixhosa");
        assertEquals(1, greeting.greetedUser(Collections.singletonList("Sino"), "Sino"));
    }

    @Test
    public void shouldBeAbleToGreetInIsizulu() {
        Greeting greeting = new Greeting();
        greeting.greet("Andre", "isizulu");
        greeting.greet("Unalo", "isizulu");
        assertEquals(0, greeting.greetedUser(Collections.singletonList("Andre"), "Unalo"));
    }

    @Test
    public void shouldBeAbleToGreetInSesotho() {
        Greeting greeting = new Greeting();
        greeting.greet("Bee", "sesotho");
        greeting.greet("Lulu", "sesotho");
        greeting.greet("Kat", "sesotho");
        assertEquals(0, greeting.greetedUser(Collections.singletonList("Bee"), "Lulu"), "Kat");
    }

    @Test
    public void shouldBeAbleToGreetInDefaultLanguage() {
        Greeting greeting = new Greeting();
        greeting.greet("Chuma", "");
        greeting.greet("Lisa", "");
        greeting.greet("Khosi", "");
        assertEquals(0, greeting.greetedUser(Collections.singletonList("Chuma"), "Lisa"), "Khosi");
    }


    //@Test
//    public void shouldBeAbleToReturnGreetedUsersAndTheirCount() {
//        Greeting greeting = new Greeting();
//        greeting.greet("Sivu", "isixhosa");
//        greeting.greet("Lebo", "isizulu");
//        greeting.greet("Lebo", "sesotho");
//        assertEquals(2, greeting.greetedAll(Collections.singletonList("Lebo"), "Sivu"));
//   }
}


