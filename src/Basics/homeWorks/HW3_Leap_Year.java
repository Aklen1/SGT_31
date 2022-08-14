package Basics.homeWorks;

import java.util.Scanner;

public class HW3_Leap_Year {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Basics.ClassWorks.Input any year");
        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }


    }
    public static String determinLeapYearString(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            return year + " Leap year";
        } else {
            return  year + " Not a leap year";
        }
    }

/*    public static String determinLeapYear1(int year){
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
        } else {
        }
    }*/

}

