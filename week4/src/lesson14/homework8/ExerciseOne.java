package lesson14.homework8;

import java.util.Arrays;

public class ExerciseOne {
    public static void main(String[] args) {

        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                newArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(newArray));


    }
}
