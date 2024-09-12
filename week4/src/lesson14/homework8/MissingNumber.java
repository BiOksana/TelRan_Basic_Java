package lesson14.homework8;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer number: ");
        int[] array = getArray(scanner.nextInt());
        System.out.println("The missing number of array " + Arrays.toString(array) + " is " + findTheMissingNumber(array));
    }

    public static int findTheMissingNumber(int[] array) {
        int result = 0;
        int[] arrayClone = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayClone);
        if (arrayClone[0] != 1) {
            result = 1;
        } else if (arrayClone[arrayClone.length - 1] != arrayClone.length + 1) {
            result = arrayClone[arrayClone.length - 1] + 1;
        } else {
            for (int i = 0; i < arrayClone.length - 1; i++) {

                if ((arrayClone[i + 1] - arrayClone[i]) > 1) {
                    result = arrayClone[i] + 1;
                }
            }
        }
        return result;
    }

    public static int[] getArray(int n) {
        int[] array = new int[n - 1];
        String str = "";
        int index = 0;
        while (index < array.length) {
            int number = (int) (Math.random() * n + 1);
            if (number != 0 && !str.contains(String.valueOf(number))) {
                str += number + " ";
                index++;
            }
        }
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }
        return array;
    }
}
