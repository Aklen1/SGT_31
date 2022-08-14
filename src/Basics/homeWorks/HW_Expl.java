package Basics.homeWorks;

import java.util.Arrays;

public class HW_Expl {
    public static void main(String[] args) {

        int [] myArray = { 1,2,3};
        int[] newArray = new int [myArray.length];

        for (int i =0; i < myArray.length; i++) {
            newArray[0] = myArray[0];

        }
            System.out.println("Source Array: " + Arrays.toString(myArray));
            System.out.println("New Array: " + Arrays.toString(newArray));
        }
    }

