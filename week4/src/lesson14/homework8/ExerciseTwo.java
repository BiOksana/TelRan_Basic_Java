package lesson14.homework8;

import java.util.Arrays;

public class ExerciseTwo {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90 + 10);
        }

        boolean isTrue = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isTrue = false;
                System.out.println(Arrays.toString(array) + " - не строго возрастающая последовательность ");
                break;
            }
        }

        if (isTrue) {
            System.out.println(Arrays.toString(array) + " - Строго возрастающая последовательность ");
        }

    }
}
