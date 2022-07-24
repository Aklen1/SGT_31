package homeWorks;

import java.util.Scanner;

public class HW_2_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // From 3 random numbers we have to find the greatest one
        // Method 1
        int a, b, c;
        System.out.println("Please enter 1st number");
        a = scanner.nextInt();
        System.out.println("Please enter 2nd number");
        b = scanner.nextInt();
        System.out.println("Please enter 3rd number");
        c = scanner.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a + "is the greatest number");
        } else if (b >= a && b >= c) {
            System.out.println(b + "is greatest number");
        } else {
            System.out.println(c + "is the greatest number");
        }
        //Method 2

        int num1, num2, num3;
        System.out.println("Please enter number 1");
        num1 = scanner.nextInt();
        System.out.println("Please enter number 2");
        num2 = scanner.nextInt();
        System.out.println("Please enter number 3");
        num3 = scanner.nextInt();
        int max = Math.max(num1, num2); // compare 1 and 2nd
        max = Math.max(max, num3); // result of 1st calculation we define as max
        System.out.println("max number " + max);
        //Method 3

        System.out.println(Math.max(Math.max(num1, num2), num3));
        //Calls Math.max method 2 times

        //LEAP YEAR
        System.out.println("Input any year");
        int year = scanner.nextInt();
        if ((year % 4 ==0 && year % 110 !=0) || year % 400 == 0){
            //If devided by 4 not equal 0  OR devided by 400 != 0
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");

        }
        System.out.println("Input any number");
        int number = scanner.nextInt();
        System.out.println(number % 2);






    }
}
