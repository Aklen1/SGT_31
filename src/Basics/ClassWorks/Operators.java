package Basics.ClassWorks;

public class Operators {
    public static void main(String[] args) {
        //math operators + - / * %
        int x = 100;
        x += 100;
        // x = x+100;
        x = 3;
        System.out.println("x="+ x);

        System.out.println(20*100);
        //INCREMENTATION OPERATORS
        //Post-incrementation
        int num =10;
        System.out.println("num ="+ num++);
        System.out.println("num="+num);
        //pre-inrementation
        int num2 = 20;
        System.out.println("num2="+ ++num2);
        //Increase or decrease variable by one
        int var = 10;
        var +=1;
        var = var +1;
        ++var;
        var++;

        //RELATIONAL OPERATORS
        // Equality ==
        int a = 1;
        int b = 10;
        System.out.println("equality = "+(a==b)); // is a equal to be

        //Inequality !=
        System.out.println("inequality -" );
        // FIX ME

        //LOGICAL OPERATORS
        //Works if both true
        boolean boolValue1 = true;
        boolean boolValue2 = false;
        System.out.println(boolValue1 && boolValue2);

        boolean boolValue3 = true;
        boolean boolValue4 = true;
        System.out.println(boolValue3 && boolValue4);
        // ||- OR (Alternative (works is both FALSE)

        boolean weather = false;
        boolean rain = false;
        System.out.println(weather || rain);

        boolean sun = true;
        boolean wind = false;
        System.out.println(sun || wind);
    }

}
