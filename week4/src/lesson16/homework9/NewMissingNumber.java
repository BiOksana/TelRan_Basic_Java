package lesson16.homework9;

import java.util.Arrays;
import java.util.Scanner;

public class NewMissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer number: ");
        int[] array = getArray(scanner.nextInt());
        System.out.println("The missing number in the array " + Arrays.toString(array) + " is " + findTheMissingNumber(array));
    }

    public static int findTheMissingNumber(int[] array) {
        int sum = 0;
        int arithmeticProgressionSum = (int)((((double)(1 + array.length + 1)) / 2) * (array.length + 1));
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return arithmeticProgressionSum - sum;
    }
    public static int[] getArray(int number) {
        int[] array = new int[number - 1];
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < array.length) {
            int randomNumber = (int)(Math.random() * number + 1);
            if (!stringBuilder.toString().contains(Integer.toString(randomNumber))) {
                stringBuilder.append(randomNumber).append(" ");
                index++;
            }
        }
        String[] stringsArray = stringBuilder.toString().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(stringsArray[i]);
        }
        return array;
    }
}
