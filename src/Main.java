import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String playerOne;
    String playerTwo;
    String answer;
    boolean done = false;

    while (!done) {
      playerOne = "";
      playerTwo = "";
      answer = "";

      // Get Player 1's move
      while (!playerOne.equalsIgnoreCase("r")
        && !playerOne.equalsIgnoreCase("p")
        && !playerOne.equalsIgnoreCase("s")) {
        System.out.print("Enter your move Player 1 [r|p|s]: ");
        playerOne = in.next();
        in.nextLine();
      }

      // Get Player 2's move
      while (!playerTwo.equalsIgnoreCase("r")
        && !playerTwo.equalsIgnoreCase("p")
        && !playerTwo.equalsIgnoreCase("s")) {
        System.out.print("Enter your move Player 2 [r|p|s]: ");
        playerTwo = in.next();
        in.nextLine();
      }
      if (playerOne.equalsIgnoreCase("r")) {
        if (playerTwo.equalsIgnoreCase("r")) {
          System.out.println("Rock vs. Rock. It's a tie!");
        } else if (playerTwo.equalsIgnoreCase("p")) {
          System.out.println("Paper covers Rock. Player 2 wins!");
        } else {
          System.out.println("Rock breaks Scissors. Player 1 wins!");
        }
      } else if (playerOne.equalsIgnoreCase("p")) {
        if (playerTwo.equalsIgnoreCase("r")) {
          System.out.println("Paper covers Rock. Player 1 wins!");
        } else if (playerTwo.equalsIgnoreCase("p")) {
          System.out.println("Paper vs. Paper. It's a tie!");
        } else {
          System.out.println("Scissors cuts Paper. Player 2 wins!");
        }
      } else {
        if (playerTwo.equalsIgnoreCase("r")) {
          System.out.println("Rock breaks Scissors. Player 2 wins!");
        } else if (playerTwo.equalsIgnoreCase("p")) {
          System.out.println("Scissors cuts Paper. Player 1 wins!");
        } else {
          System.out.println("Scissors vs. Scissors. It's a tie!");
        }
      }
      while (!answer.equalsIgnoreCase("y")
        && !answer.equalsIgnoreCase("n")) {
        System.out.print("Play again? [y|n]: ");
        answer = in.next();
        if (answer.equalsIgnoreCase("n")) {
          done = true;
        }
        in.nextLine();
      }
    }
  }
}