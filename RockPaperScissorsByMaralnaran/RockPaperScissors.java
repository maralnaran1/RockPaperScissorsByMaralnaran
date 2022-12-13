import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose [r]ock, [p]aper, or [s]cissors: ");
        String playerMove = scanner.nextLine();
        if (playerMove.equals("r") || playerMove.equals("rock")) {
            playerMove = "rock";
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = "paper";
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = "scissors";
        } else {
            System.out.print("Invalid Input. Try again...");
            return;
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        String computerMove = "";
        switch (computerRandomNumber) {
            case 1 :
                computerMove = "rock"; break;
            case 2 :
                computerMove = "paper"; break;
            case 3 :
                computerMove = "scissors"; break;
        }
        System.out.printf("The computer choose %s.%n", computerMove);
        if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
                (playerMove.equals("paper") && computerMove.equals("rock")) ||
                (playerMove.equals("scissors") && computerMove.equals("paper"))) {
            System.out.println("You win.");
        } else if ((playerMove.equals("rock") && computerMove.equals("paper")) ||
                (playerMove.equals("paper") && computerMove.equals("scissors")) ||
                (playerMove.equals("scissors") && computerMove.equals("rock"))) {
            System.out.println("You lose.");
        } else {
            System.out.println("This game was a draw.");
        }


    }
}