package Basics.ClassWorks;

import java.util.Scanner;

public class LOOPS {
    public static void main(String[] args) {
     /*   System.out.println("Hello WOrld! ");
        System.out.println("Hello WOrld! ");
        System.out.println("Hello WOrld! ");
        System.out.println("Hello WOrld! ");
        System.out.println("Hello WOrld! ");
        System.out.println("Hello WOrld! ");
        System.out.println("Hello WOrld! ");
        System.out.println("Hello WOrld! ");
        System.out.println("Hello WOrld! ");
        System.out.println("Hello WOrld! ");*/

        // For LOOP
        for (int i = 0; i < 10; i ++) {
            System.out.println("Hello Nellija ! "+i);
        }

        //While LOOP
        int i =0;
        while (i <10){
            System.out.println("Hello Nellija!");
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int input = scanner.nextInt();
        while (input != 0){
            System.out.println("+100");
            System.out.println("Please enter any number");
            input = scanner.nextInt();

            //Do While LOOP
            int j=10;
            while (j<10){
                System.out.println("This is While LOOP!");
            }
            do {
                System.out.println("This is Do While LOOP");

            }while (j<10);

        }

    }
}
