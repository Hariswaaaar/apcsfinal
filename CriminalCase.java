import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CriminalCase{
  private static void delay() { 
    try {
      TimeUnit.SECONDS.sleep(1);
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
  public static void play() {
    Scanner scanner = new Scanner(System.in);
    
    // Introduce the game and the player's role as a detective
    System.out.println();
    System.out.println("Welcome to Criminal Case Game!");
    delay();
    System.out.println("In this game, you are a detective who has to solve a series of crimes.");
    delay();
    System.out.println("To do so, you have to use if statements and boolean expressions to eliminate suspects and gather clues.");
    delay();
    System.out.println("Overall there will be 2 cases to solve.");
    System.out.println();
    delay();

    // Begin the first case: a robbery
    System.out.println("Your first case is a ROBBERY.");
    delay();
    System.out.println("You have a list of suspects, each of whom has a unique combination of characteristics.");
    delay();
    System.out.println("To eliminate suspects, you can ask the witness if they saw certain characteristics.");
    delay();
    System.out.println("For example, you can ask if the suspect was wearing a mask.");
    delay();
    System.out.println("If the witness saw the suspect's face, you can use an if statement to eliminate suspects who were wearing masks.");
    System.out.println("");

    // Create a list of suspects and their characteristics
    String[] suspects = {
      "Suspect 1: tall, blond, wearing a blue jacket",
      "Suspect 2: short, brunette, wearing a red jacket",
      "Suspect 3: medium height, blond, wearing a mask"};

     // While loop has been created
      boolean rn = false;
      while (rn==false)
      {
        rn=true;
    // Ask the witness if they saw the suspect's face
    System.out.println("Did the witness see the suspect's face? (y/n)");
    System.out.println("");
    String sawFace = scanner.nextLine();

    // Use an if statement to eliminate suspects who were wearing masks
    if (sawFace.equals("y")) {
        delay();
        System.out.println("");
        System.out.println("Since the witness saw the suspect's face, we can eliminate Suspect 3, who was wearing a mask.");
        System.out.println("");
        delay();
        suspects[2] = null;
      } else if (sawFace.equals("n")) {
        System.out.println("");
        delay();
        System.out.println("Since the witness didn't see the suspect's face, there is no other clue to find out the criminal.");
        delay();
        System.out.println("");
        System.out.println("GAME OVER!");
        System.exit(1);      
      } else {
        // invalid choice
        System.out.println("Invalid choice. Please try again.");
        // This will go back to the question, if someone mis clicks the key. 
        rn=false; 
    }
  }
  boolean an = false;
  while (an==false)
  {
    an=true;
     {
      // Ask the witness if the suspect was wearing a blue or red jacket
      System.out.println();
      delay();
      System.out.println("Was the suspect wearing a blue or red jacket? (b/r)");
      delay();
      String jacketColor = scanner.nextLine();
      
      // Use an if statement to eliminate suspects who were wearing the wrong color jacket
      if (jacketColor.equals("b")) {
        delay();
        System.out.println("");
        System.out.println("Since the suspect was wearing a blue jacket, we can eliminate Suspect 2 who was wearing a red jacket and 3 who were not wearing a Jacket."); 
        System.out.println("");
        delay();
        suspects[1] = null;
      } else if (jacketColor.equals("r")) {
        delay();
        System.out.println("");
        System.out.println("Since the suspect was wearing a red jacket, we can eliminate Suspect 1, who was wearing a blue jacket and 3 who were not wearing a Jacket.");
        System.out.println("");
        delay();
        suspects[0] = null;
      } else {
        // invalid choice
        System.out.println("Invalid choice. Please try again.");
        an=false; 
      }
    }
    }
      
        // Print the remaining suspects
        delay();
        System.out.println("The remaining suspects are:");
        delay();
        for (int i = 0; i < suspects.length; i++) {
        if (suspects[i] != null) {
        System.out.println(suspects[i]);

        // Identify the culprit
        delay();
        System.out.println("The culprit for the first case is " + (suspects[i]));
    }
  }
  // Identify the culprit
  delay();
  System.out.println("Congratulations, you have solved the robbery case!");
  delay();
  System.out.println("You'll be moving to MURDER case"); 
  delay();
  System.out.println("");

  //Moving to Case 2
  Case2 game = new Case2();
        game.play();
}
}

