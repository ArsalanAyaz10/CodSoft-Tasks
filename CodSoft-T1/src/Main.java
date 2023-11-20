public class Main {
    public static void main(String[] args) {

        Game G1 = new Game();

        do {
        G1.clearScreen();
        G1.startRound();
    }
        while (G1.playAgain());
        System.out.println("\nThanks for PLaying!");
    }
}