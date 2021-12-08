import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args){
        System.out.println("Let's play Rock, Paper, Scissors! 1 for ROCK, 2 for PAPER, and 3 for SCISSORS!");
        Scanner Input = new Scanner(System.in);
        //Wanted to define all variables first!
        var playerMoveName = "null";
        var cMoveName = "null";
        int gameEnd = 0;
        int computerScore = 0;
        int playerScore = 0;
        boolean cRock;
        boolean cPaper;
        boolean cScissors;
        boolean rock;
        boolean paper;
        boolean scissors;
        double ComputerMove;
        double PlayerMove;
        //This is the part where it loops!
        while (gameEnd == 0) {
            //Defined these booleans as "false" here so that every time it is looped it returns to "false"!
            cRock = false;
            cPaper = false;
            cScissors = false;
            rock = false;
            paper = false;
            scissors = false;
            //This is the basic stuff, it generates a random number between 0 and 3 (excluding 3)
            ComputerMove = Math.random() * 3;
            if (ComputerMove < 1) {
                cRock = true;
                cMoveName = "rock";
            } else if (ComputerMove < 2) {
                cPaper = true;
                cMoveName = "paper";
            } else {
                cScissors = true;
                cMoveName = "scissors";
            }
            //Here, we ask the player for a move.
            PlayerMove = Input.nextDouble();
            if (PlayerMove == 1) {
                rock = true;
                playerMoveName = "rock";
            } else if (PlayerMove == 2) {
                paper = true;
                playerMoveName = "paper";
            } else if (PlayerMove == 3){
                scissors = true;
                playerMoveName = "scissors";
                // By this next line of code, we reset everything when the user gives some random input.
            } else {
                System.out.println("That is not a desired input. Please try again.");
                continue;
            }
            //Draw situation.
            if (rock && cRock || paper && cPaper || scissors && cScissors){
                System.out.println("You and the computer chose the same move. The move was " + playerMoveName +".");
                continue;
                // Lost situation
            } else if (rock && cPaper || paper && cScissors || scissors && cRock){
                System.out.println("You lost this round! The computer played " + cMoveName + " and you played " + playerMoveName + "!");
                computerScore++;
                // Win situation
            } else {
                System.out.println("You won this round! The computer played " + cMoveName + " and you played " + playerMoveName + "!");
                playerScore++;
            }
            //Checking if the game is over, if so ,ending the loop
            if (playerScore == 5){
                gameEnd = 1;
                System.out.println("You won against the computer! The score is " + playerScore + "-" + computerScore + "!");
            } else if (computerScore == 5){
                gameEnd = 1;
                System.out.println("You lost against the computer! The score is " + playerScore + "-" + computerScore + "!");
            } else {
                System.out.println("Next round! Current score is " + playerScore + "-" + computerScore);
            }
        }
    }
}

