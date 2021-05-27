package net.greet;

public class Main {

    public static void main(String args[]) {
    Greeting greeting = new Greeting();

        while (greeting.exit) {
            int paramCount = 0;
            System.out.println("1. greet 'greet [name] [language]' \n2. check who's been greeted 'greeted' or 'greeted [name]' \n3. remove user 'remove [user]' \n4. clear the guest list 'clear' \n5. count numbers of greeted people 'count' \n6. leave programme 'exit'");
            String userInput = greeting.s.nextLine().toLowerCase();
            String words[] = userInput.split(" ");

            for(String token : words) {
//                System.out.println(token);
                paramCount += 1;
            }

            if (words[0].equals("greet") && paramCount >= 2) {
                if (paramCount <= 2) {
                    greeting.greet(words[1], "");
                    greeting.users.add(words[1]);
                } else if (paramCount >= 3) {
                    greeting.greet(words[1], words[2]);
                    greeting.users.add(words[1]);
                    greeting.language.add(words[2]);
                }

            }
            else if(words[0].equals("greeted")) {
//                System.out.println(paramCount);
                switch(paramCount) {
                    case 1:
                        greeting.greetedAll(greeting.users);
                        break;
                    case 2:
                        System.out.println(words[1] + " has been greeted " + greeting.greetedUser(greeting.users, words[1]) + " time(s)");
                        break;
                }
            }
            else if(words[0].equals("remove") && paramCount >= 2){
                if (paramCount <= 2) {
                    greeting.removeUser();
                    greeting.users.remove(words[1]);
                    System.out.println("User removed.");
                }
//                else if (paramCount >= 3) {
//                    removeUser();
//                    users.remove(words[1]);
//                    language.remove(words[2]);
//                }
//                else if(paramCount <= 1){
//                    System.out.println("Please separate words with space e.g. remove Sino ");
//                }
            }
            else if(words[0].equals("clear")) {
                greeting.users.clear();
                greeting.language.clear();
                System.out.println("All information Cleared.");
            }
            else if (userInput.equals("exit")) {
                System.out.println("Good bye.");
                greeting.exit();
            }
            else if (words[0].equals("count")) {
                greeting.counter(greeting.users);
            } else {
                System.out.println("Please separate words with space e.g. greet Sino isixhosa");
            }

        }
    }
}
