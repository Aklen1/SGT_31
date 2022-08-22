package Basics.homeWorks;

import java.util.Scanner;

public class GameRockPaperScissors {
    static String RockPaperScissors(String  user1, String user2) {
        String winner="";
        if (user1.compareTo("scissors") == 0 && user2.compareTo("paper") == 0)
            winner = " Player 1 wins! Better luck next time!";
        if (user1.compareTo("paper") == 0 && user2.compareTo("rock") == 0)
            winner =" Player 1 Wins! Better luck next time!";
        if (user1.compareTo("rock") == 0 && user2.compareTo("paper") == 0)
            winner =" Player 2 Wins!!";
        if (user1.compareTo("scissors") == 0 && user2.compareTo("rock") == 0)
            winner =" Player 2 Wins!!";
        if (user1.compareTo("paper") == 0 && user2.compareTo("scissors") == 0)
            winner =" Player 2 Wins!!";
        else if (user1.compareTo(user2) == 0) {
            winner = "Tie! Please try again!";
        }
        return winner;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the game Game \"Rock, Paper, Scissors\" simulator!\n------------------------------------------------------------");

        System.out.println("Player Nr.1 Please enter one of the option: Rock, Paper or Scissors: ");
        Scanner scanner = new Scanner(System.in);
        String user1 = scanner.nextLine();

        System.out.println("\nPlayer Nr.2 Please enter one of the option: Rock, Paper or Scissors:");
        String user2 = scanner.nextLine();

        System.out.println("\n -------------------------------------\n Result is :"+RockPaperScissors(user1.toLowerCase(),user2.toLowerCase()));
    }
}
