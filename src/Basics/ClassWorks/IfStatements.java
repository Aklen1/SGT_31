package Basics.ClassWorks;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a grade");
        int grade = scanner.nextInt();
        // Print out "Good job!"if grade is over 6
        if (grade > 6) {
            System.out.println("Good job!");
        }

        // Print out "Good job!"if grade is over 3
        if (grade > 3) {
            System.out.println("Good job!");
        }

        // If else statement
        // print good job of grade is over 6, if not then print "Better luck next time

        if (grade > 6) {
            System.out.println("Good job!");
        } else {
            System.out.println("Better luck next time!");

        }
        //Print out  "You have a fever !" if temp is over 36.8 and print out "You are healthy!" if not
        float temperature = 36.5f;
        if (temperature > 36.8f) {
            System.out.println("You have a fever!");
        } else {
            System.out.println("You are healthy");

            //ELSE IF
            // 1-3 --> "Very bad!
            // 4-5 --> "Okay!
            //6 --> "Nice!
            // 7-10 --> "Very good!
        }

        if (grade < 4) {
            System.out.println("Very bad!");
        } else if (grade >= 4 && grade <= 5) {
            System.out.println("Okay!");
        } else if (grade == 6) {
            System.out.println("Nice!");
        } else {
            System.out.println("Very good!");
        }



    }
}