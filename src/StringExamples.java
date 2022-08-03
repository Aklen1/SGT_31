import java.sql.SQLOutput;
import java.util.Locale;

public class StringExamples {
    public static void main(String[] args) {
        String text1 = "This is text example";
       /* String text2 = text1;*/
        String text2 = text1.intern();
        System.out.println(text2);

        //CONCATENATION OF STRINGS

        String input1 = "This is ";
        String input2 = "Input text";
        String inputCombined = input1.concat(input2);
        System.out.println(inputCombined);

        //COMPARING STRINGS
        String texts1 = "Test ";
        String texts2 = "Test";
        System.out.println(texts1.equals(texts2));

        // STRING CLASS METHOD
        String InputText = "This is my text";

        //Length
        System.out.println(InputText.length());

        //TO UPPERCASE
        System.out.println(InputText.toUpperCase());

        //TO LOWERCASE
        System.out.println(InputText.toLowerCase());
        //STRING CLASS METHODS - INDEXOF()
        String speakingText = "This is Test";
        System.out.println(speakingText.indexOf('e'));
        //we are asking which index has veryst ë"letter in text
        









    }
}
