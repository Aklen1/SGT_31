package homeWorks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW_Pers_Code {
    public static void main(String[] args) {
        String runAgain;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your personal code");
            String personalCode = scanner.nextLine().trim();

            Pattern pattern1 = Pattern.compile("[0-9]{6}-[0-9]{5}");
            Matcher matcher1 = pattern1.matcher(personalCode);
            boolean correctPerscode = matcher1.matches();
            if (correctPerscode) {
                System.out.println("Your inputted personal code is valid \n");
            } else {
                System.out.println("Your inputted personal code is NOT valid \n");
            }
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Do you want to check your personal code again? y/n \n");
            runAgain = scanner1.nextLine().trim();
        } while (runAgain.equals("y"));
    }
}
