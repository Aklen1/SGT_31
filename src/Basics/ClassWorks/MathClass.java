package Basics.ClassWorks;

public class MathClass {
    public static void main(String[] args) {
        float num = 5.145f;
        System.out.println(num);
        //ROUNDING DOWN

        System.out.println(Math.floor(num));
        //Rounding up
        System.out.println(Math.ceil(num));
        //Rounding according to Math principles
        System.out.println(Math.round(num));
        //Rounding to absolute value (positive/negative)
        System.out.println(Math.abs(num));
        //Power - vozvedenije v stepen
        System.out.println(Math.pow(2.5,2));
        // Square root - izvlecenije kvadratnogo kornja
        System.out.println(Math.sqrt(64));
        // Finding max value between 2 values
        System.out.println(Math.max(100, 103.6));
        // Finding min value between 2 values
        System.out.println(Math.min(55,43));
        //RAndom value - need nothing to put in skobki
        //Generate randomly number from 0 till 1
        System.out.println(Math.random());
        //Random number from 1 to 100
        System.out.println(Math.random()*10);
        // Casting - reduce space
        System.out.println((int)99.989);
        System.out.println((10+5)*2);
        System.out.println((int) (Math.random()*20)+1);


    }

}

