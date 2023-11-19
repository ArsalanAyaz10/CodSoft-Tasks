import java.util.*;
public class Game extends GameParent {

    Scanner scan = new Scanner(System.in);
    int userInput;
    String playAgain;

    /*
Here all the input and calc for the game be present.
 */
    void StartRound(){

    GameReset();
        int attempts = RemainingAttempts();
     while (attempts>0)
     {
         System.out.println("Guess a number between 1-100 in 5 Attempts");
         userInput = scan.nextInt();

         if (userInput == getGuessNumber()){
             System.out.println("Congrats You guessed correctly!");
             incrementUserScore();
             DisplayResults();
             RemainingAttempts();
             break;
         }else{
             if (userInput < getGuessNumber()) {
                 System.out.println("Too Low! Try again.");
             } else {
                 System.out.println("Too High! Try again.");
             }
         }
         attempts--;
         if (attempts == 0){
             System.out.println("Out of Attempts!");
             DisplayResults();
             break;
         }
     }

 }
    public boolean playAgain() {
        System.out.print("Do you want to play again? (yes/no): ");
        String playAgain = scan.next();
        return playAgain.equals("yes");

    }

}
