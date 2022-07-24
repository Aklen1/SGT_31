public class CharExamples {
    public static void main(String[] args) {
        /*char ch = 'M';
        System.out.println(ch);
        ch++;
        System.out.println(ch);

        //Cast from Int to Char
        System.out.println((char)122);

        //Print out all lower case alphabet letters
        System.out.println("a");*/

        //Version 1
        char letter = 'a';
        for (letter = 'a'; letter < 123; letter++){
            System.out.print(letter + " ");
        }
        //Version 2
        for (char ch = (char) 97; ch < (char) 123; ch++) {
            System.out.print(ch +" ");
        }

        //Version 3
        //Print out all lower case alphabet letters --> a b c d e ...
        for (int i = 97; i <= 122; i++){
            System.out.print((char)i + " ");
        }

    }
}
