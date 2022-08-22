package Basics.homeWorks;

import java.util.Scanner;

public class RPC_2 {

         public static void main(String[] args) {
             System.out.println("Welcome to the game Game \"Rock, Paper, Scissors\" simulator!\n");
             System.out.println("Player Nr.1 Please enter one of the option: Rock, Paper or Scissors ");
             Scanner scanner = new Scanner(System.in);
             String answerA = scanner.nextLine();
             String answer1 = answerA.toLowerCase();
             /* System.out.println("Your choice number 1 is "+answer1);*/
             System.out.println("Player Nr.2 Please enter one of the option: Rock, Paper or Scissors");
             String answerB = scanner.nextLine();
             String answer2 = answerB.toLowerCase();
             /* System.out.println(answer1 + " " + answer2);*/

/*         }

        public static void compareResults(String answer1,String answer2){
            System.out.println(answer1 + answer2);*/

            if (answer1.compareTo("scissors") == 0 && answer2.compareTo("paper") == 0)
                System.out.println(" Player 1 wins! Better luck next time!");
            if (answer1.compareTo("paper") == 0 && answer2.compareTo("rock") == 0)
                System.out.println(" Player 1 Wins! Better luck next time!");
            if (answer1.compareTo("rock") == 0 && answer2.compareTo("paper") == 0)
                System.out.println("Player 2 Wins!!");
            if (answer1.compareTo("scissors") == 0 && answer2.compareTo("rock") == 0)
                System.out.println("Player 2 Wins!!");
            if (answer1.compareTo("paper") == 0 && answer2.compareTo("scissors") == 0)
                System.out.println("Player 2 Wins!!");
            else if (answer1.compareTo(answer2) == 0) {
                System.out.println("Tie! Please try again!");

            }


        }

    }



