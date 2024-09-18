package lesson16.homework9;

import java.util.Arrays;

public class ExtraExercise {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;
        int c = -5;

        printIncreasingSequence(a, b, c);
    }

    public static void printIncreasingSequence(int... numbers) {
        System.out.println(Arrays.toString(sortSequence(numbers)));
    }

    public static int[] sortSequence(int... numbers) {
        int[] array = Arrays.copyOf(numbers, numbers.length); //new int[numbers.length];
        for (int i = 0; i < array.length; i++) {
            int temp;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
