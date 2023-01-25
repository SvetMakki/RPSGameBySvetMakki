import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static final String ROCK = "Rock";
    public static final String PAPER = "Paper";
    public static final String SCISSORS = "Scissors";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String playerMove = "";
        System.out.println("Take your pick: [r]ock, [p]aper, [s]cissors!");
        playerMove = scanner.nextLine();
        if (playerMove.equals("r") || playerMove.equals("rock")) {
            playerMove = ROCK;

        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = PAPER;

        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = SCISSORS;

        } else {
            System.out.println("Invalid Input! Try Again...");
            return;
        }
        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        String computerMove = "";
        switch (computerRandomNumber) {
            case 1:
                computerMove = ROCK;
                break;

            case 2:
                computerMove = PAPER;
                break;

            case 3:
                computerMove = SCISSORS;
                break;

        }
        System.out.printf("Your Opponent choose: %s%n", computerMove);

        if (playerMove.equals(ROCK) && computerMove.equals(SCISSORS) || playerMove.equals(SCISSORS) && computerMove.equals(PAPER)
                || playerMove.equals(PAPER) && computerMove.equals(ROCK)) {
            System.out.println("Congratulations! You WIN!");

        } else if (playerMove.equals(ROCK) && computerMove.equals(PAPER) || playerMove.equals(SCISSORS) && computerMove.equals(ROCK)
                || playerMove.equals(PAPER) && computerMove.equals(SCISSORS)) {
            System.out.println("Ohhh...I Am Sorry, Dear...You loose!");

        } else {
            System.out.println("This Game was draw!");
        }


    }

}

