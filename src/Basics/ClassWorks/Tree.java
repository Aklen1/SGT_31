package Basics.ClassWorks;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number!");
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}