package Basics.ClassWorks;

public class ZOMBIE {
    public static void main(String[] args) {

        // Variant 1
        String [] zveri = new String [3];
        zveri [0] = "zajac";
        zveri [1] = "kot";
        zveri [2] = "mish";

        String [] eda = new String [3];
        eda [0] = "morkov";
        eda [1] = "kolbasa";
        eda [2] = "krupa";

        System.out.println(zveri[0] + " "+  eda[1]);

        //Variant 2
        String [] zverushi = { "zajac", "kot", "mish"} ;
        String [] pajka = { "morkov", "kolbasa", "krupa"};
        System.out.println(zverushi[0] + " "+  pajka[1]);
        //2D Arrays
        //Variant A
        int [][] lotterycard = { { 20,15,7},
                                 { 8, 7, 19},

        };
        System.out.println(lotterycard[0][1]);

        //Variant B
        //[row][column]

        int [][]lotteryCards = new int[2][3];
        lotteryCards[0][0] = 20;
        lotteryCards[0][1] = 15;
        lotteryCards[0][2] = 7;
        lotteryCards[1][0] = 8;
        lotteryCards[1][1] = 7;
        lotteryCards[1][2] = 19;
        System.out.println(lotteryCards[0][1]);


    }
}
