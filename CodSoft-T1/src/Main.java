public class Main {
    public static void main(String[] args) {

        Game G1 = new Game();

        do {

        G1.StartRound();
        }
        while (G1.playAgain());

        System.out.println("Thanks for PLaying!");
    }
}