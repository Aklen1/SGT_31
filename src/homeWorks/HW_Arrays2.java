package homeWorks;

public class HW_Arrays2 {
    public static void main(String[] args) {
/*
        int[] SourceArrays = {1789, 2035, 1899, 1456, 2013, 4458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};*/
        int [] SourceArray = new int [14];
        SourceArray [0] = 1789;
        SourceArray [1] = 2035;
        SourceArray [2] = 1899;
        SourceArray [3] = 1456;
        SourceArray [4] = 2013;
        SourceArray [5] = 4458;
        SourceArray [6] = 2458;
        SourceArray [7] = 1254;
        SourceArray [8] = 1472;
        SourceArray [9] = 2365;
        SourceArray [10] = 1456;
        SourceArray [11] = 2165;
        SourceArray [12] = 1457;
        SourceArray [13] = 2456;
            for (int j = 0; j < SourceArray.length ; j++) {
                System.out.print(SourceArray[j] + " ");


         int [] NewArray = SourceArray;
            /* NewArray [0] = SourceArray [0];
             NewArray [1] = SourceArray [1];
             NewArray [2] = SourceArray [2];
             NewArray [3] = SourceArray [3];
             NewArray [4] = SourceArray [4];
             NewArray [5] = SourceArray [5];
             NewArray [6] = SourceArray [6];
             NewArray [7] = SourceArray [7];
             NewArray [8] = SourceArray [8];
             NewArray [9] = SourceArray [9];
             NewArray [10] = SourceArray [10];
             NewArray [11] = SourceArray [11];
             NewArray [12] = SourceArray [12];
             NewArray [13] = SourceArray [13];*/

             for ( int i = 0; i < NewArray.length; i++);
                /*System.out.print(NewArray[j] + " ");*/

                int c = 0;
                SourceArray[c] = NewArray[NewArray.length -1 -c];
                System.out.println(NewArray[c] + " ");

         }
            }
        }



