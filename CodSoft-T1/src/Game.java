import java.util.*;
public class Game extends GameParent {

    //Variables for user input and to store the play again option.
    Scanner scan = new Scanner(System.in);
    int userInput;
    String playAgain;


//This is the main method for the game working.
    void StartRound(){

    GameReset();
    //reset the game every time its called.


    int attempts = RemainingAttempts();
    //fetch the attempts from the parent class.

     //loop end when attempts runs out
     while (attempts>0)
     {
         System.out.println("Guess a number between 1-100 in 5 Attempts");
         userInput = scan.nextInt();

         if (userInput == getGuessNumber()){
             System.out.println("Congrats You guessed correctly!");
             incrementUserScore();
             DisplayResults(); // display the results
             break;
         }else{
             if (userInput < getGuessNumber()) {
                 System.out.println("Too Low! Try again.");
             } else {
                 System.out.println("Too High! Try again.");
             }
         }
         attempts--;
         //reduce attempts once every turn

         if (attempts == 0){
             System.out.println("Out of Attempts!");
             DisplayResults();
             break;
             //once attempts run out it exits out
         }

     }

 }
    public boolean playAgain() {
        System.out.print("Do you want to play again? (yes/no): ");
        String playAgain = scan.next();
        return playAgain.equals("yes");
//this method asks user to play again or not
    }

}
