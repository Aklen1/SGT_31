package homeWorks;

import java.util.Arrays;

public interface HW_Expl_Task2 {
    public static void main(String[] args) {
        int[] sourceArray = { 3, 5, 6, 50, 8, 8, 9, 9, 5};
        System.out.println("SourceArray:"+ Arrays.toString(sourceArray));

        for (int i =0; i < sourceArray.length /2;){
            int temp = sourceArray[i];
            sourceArray[i] = sourceArray[sourceArray.length-1-i];
            sourceArray[sourceArray.length-1 -i] = temp;

        }
        sourceArray[sourceArray.length -1] = sourceArray [0];
        System.out.println(Arrays.toString(sourceArray));
        



    }
}
