

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Case2 {
    private static void delay() { 
        try {
          TimeUnit.SECONDS.sleep(1);
        }
        catch (Exception e) {
          System.out.println(e);
        }
      }
    // variables to store the suspects, clues, and other relevant information
    private String suspect1;
    private String suspect2;
    private String clue1;
    private String clue2;
    private String clue3; 
    private String suspectWithMurderWeapon;

    public Case2() {
        // initialize the suspects and clues
        suspect1 = "John";
        suspect2 = "Jane";
        clue1 = "a bloody knife";
        clue2 = "a witness who saw the suspect running away from the scene";
        clue3 = "John Doe was wearing a blue Jacket"; 
        suspectWithMurderWeapon = suspect2;
    }

    public void play() {
        // print a message to the player explaining the situation
        System.out.println(""); 
        System.out.println("MURDER"); 
        delay(); 
        System.out.println("This is your second and final Case for Today, make sure you keep up the impression on higher officials!"); 
        delay(); 
        System.out.println("A murder has been committed, and it's up to you to solve the case!");
        delay(); 
        System.out.println("You have two suspects: " + suspect1 + " and " + suspect2 + ".");
        delay(); 
        System.out.println("You have three clues: " + clue1 + " , " + clue2 + " and " + clue3 + ".");
        delay(); 

        // create a Scanner to read player input
        Scanner scanner = new Scanner(System.in);

        // loop until the murder is solved
        while (true) {
            // present the player with a series of choices
            System.out.println(""); 
            System.out.println("What would you like to do?");
            System.out.println("1. Ask Question " + suspect1);
            System.out.println("2. Ask Question " + suspect2);
            System.out.println("3. Check clue 1");
            System.out.println("4. Check clue 2");
            System.out.println("5. Check clue 3");
            System.out.println(""); 

            // read the player's choice
            int choice = scanner.nextInt();

            // use if statements to determine the appropriate response
            if (choice == 1) {
                // question suspect 1
                System.out.println(suspect1 + ": I didn't do it! I have an alibi.");
                System.out.println("I haven't done any murder in last 10 years"); 
            } else if (choice == 2) {
                // question suspect 2
                System.out.println(suspect2 + ": I don't want to talk about it.");
                System.out.println("Please leave me alone"); 
            } else if (choice == 3) {
                // check clue 1
                System.out.println("The " + clue1 + " could be the murder weapon.");
                System.out.println("When we scanned the weapon we got both John Smith and Jane Doe fingerprints"); 

            } else if (choice == 4) {
                // check clue 2
                System.out.println("I saw the suspect running away from the scene.");
            } else if (choice == 5) {
                // check clue 2
                System.out.println("I saw the suspect running away from the scene, he was wearing a blue Jacket.");
                
            } else {
                // invalid choice
                System.out.println("Invalid choice. Please try again.");
            }

            // ask the player if they have solved the case
            System.out.println("Have you solved the case? (y/n)");
            String solved = scanner.next();

            // if the player has solved the case, check if they are correct
            if (solved.equalsIgnoreCase("y")) {
                // ask the player to enter the name of the suspect they believe committed the murder
                System.out.println("Who do you think did it?(Name)");
                String suspect = scanner.next();

                // use an if statement to check if the player's guess is correct
                if (suspect.equalsIgnoreCase(suspectWithMurderWeapon)) {
                    // the player is correct
                    System.out.println("Congratulations, you solved the case! " + suspectWithMurderWeapon + " is the murderer.");
                    delay(); 
                    System.out.println("Excellent, you solved the Robbery case and the Murder Case");
                    delay(); 
                    System.out.println("You are a true detective!");
                    delay(); 
                    System.out.println("GAME OVER!");
                    delay(); 
                    System.out.println("");


                    break;
                } else {
                    // the player is incorrect
                    delay(); 
                    System.out.println("I'm sorry, that is not the correct suspect. Please continue investigating.");
                }
            }
        }
    }
}

