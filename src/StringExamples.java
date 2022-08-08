import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

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
        //we are asking which index has very 1st 'e'  letter in text
        System.out.println(speakingText.indexOf("is"));
        //If there are more than 1 symbol, we use DOUBLE quotation marks

        //REPLACE ALL()
        //Ragana

        String textForTV = "This phone is complete ragana. And this case also is ragana";
        System.out.println(textForTV);
        System.out.println(textForTV.replace("ragana", "quene"));
        // 1st what to remove, then what to replace with

        // CHARACTER INDEX
        System.out.println(textForTV.charAt(5));
        // How to get a very last character
        System.out.println(textForTV.length());

        System.out.println(textForTV.charAt(5));
        System.out.println(textForTV.substring(5,12));
        System.out.println (textForTV.charAt (textForTV.length()-1));

        //PARSING
        // Convert String to non - primitive Data types
        String intValue = "165";
        String floatValue = "2.0";
        String doubleValue = "2.4542654";
        String boolValue  = "true";
        String longValue = "10000000000000";

        /*intValue += 4;// Just add as a symbol
        System.out.println(intValue);*/

        System.out.println(Integer.parseInt(intValue));
        System.out.println(Integer.parseInt(intValue)+4);
        //Add to calculation
        System.out.println(Float.parseFloat(intValue));
        System.out.println(Double.parseDouble (intValue));
        System.out.println(Long.parseLong(intValue));
        //Test comment

        //Trim method
        System.out.println("      This is test    ".trim());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter password (qwert*)");
        String pswd = scanner.nextLine().trim().toLowerCase();

        if (pswd.equals("qwerty")){
            System.out.println("Password correct");
        } else {
            System.out.println("Incorrect password");
        }























    }
}
