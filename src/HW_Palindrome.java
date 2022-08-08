import java.util.Scanner;

public class HW_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a palindrome");
        String InputedWord = scanner.nextLine().toLowerCase();
       /* System.out.println(InputedWord);*/
       /* System.out.println (InputedWord.charAt (InputedWord.length()-1));*/

        if (InputedWord.charAt(0) != InputedWord.charAt(InputedWord.length()-1)) {
            System.out.println("This is not a Palidrome!");

        } else {
            
            while (InputedWord.length()!= InputedWord.length()/2){
            /*for (int i =0; i <15; i++){*/
            /*    if(i==InputedWord.length()/2);*/
               /* System.out.println(InputedWord.length()/2);*/
                break;


            }
            System.out.println( "This is a Palindrome!");
        }



        






    }
}
