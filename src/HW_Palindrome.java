import java.util.Scanner;

public class HW_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a palindrome");
        String InputedWord, Rev = "";
        InputedWord = scanner.nextLine().toLowerCase();


        int length = InputedWord.length();

        for (int i = length -1; i >= 0; i--)
        Rev = Rev + InputedWord.charAt(i) ;

        if (InputedWord.equals(Rev))
            System.out.println(InputedWord + "  This is palindrome");
        else
            System.out.println(InputedWord + "  This is not a palindrome");



           
    }
}
