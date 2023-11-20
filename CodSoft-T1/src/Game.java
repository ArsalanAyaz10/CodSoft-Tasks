import java.util.Scanner;

public class Game extends GameParent {

    Scanner scan = new Scanner(System.in);
    int userInput;

    void startRound() {
        GameReset(); // Reset the game state for a new round

        System.out.println("*************CodSoft Task 1*****************************");
        System.out.println("\nWelcome to the Number Guessing Game!");

        int attempts = RemainingAttempts();

        while (attempts > 0) {
            System.out.println("\nGuess a number between 1-100 in " + attempts + " Attempts");
            userInput = scan.nextInt();

            if (userInput == getGuessNumber()) {
                System.out.println("\nCongrats! You guessed correctly!");
                incrementUserScore();
                DisplayResults(); // display the results
                break;
            } else {
                if (userInput < getGuessNumber()) {
                    System.out.println("Too Low! Try again.");
                } else {
                    System.out.println("Too High! Try again.");
                }
            }
            attempts--;

            if (attempts == 0) {
                System.out.println("\nOut of Attempts!");
                DisplayResults();
                break;
            }
        }
    }

    public boolean playAgain() {
        System.out.print("Do you want to play again? (yes/no): ");
        String playAgain = scan.next();
        return playAgain.equalsIgnoreCase("yes");
    }

    public  void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
