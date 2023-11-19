import java.util.*;
public class GameParent implements I_Result {

    private int GuessNumber;
    private int MaxAttempts;
    private int RoundsPlayed;
    private int Score;

    Random rand = new Random();
    public GameParent() {
        this.MaxAttempts = 5;
        this.RoundsPlayed = 0;
        this.Score = 0;

    }
    //upon instance being created the GuessNumber is generated (1-100)
    private void generateSecretNumber() {
        this.GuessNumber = rand.nextInt(100) + 1;
    }


    @Override
    public void DisplayResults() {
        RoundsPlayed++;
        System.out.println("Round " + RoundsPlayed + " Result!");
        System.out.println("Score: " + Score + " From " + (10 - MaxAttempts) + " Attempts");
    }

    @Override
    public void GameReset() {
        generateSecretNumber();
        MaxAttempts = 5;
    }

    public int RemainingAttempts() {
        return MaxAttempts;
    }

    public void incrementUserScore() {
        Score++;
    }

    public int getGuessNumber() {
        return GuessNumber;
    }

}
/*
Purpose of this class is to act as a parent or a modem to implement Encapsulation
and inheritance.
various methods like game reset and number generation are done here it also implements the interface
 */
