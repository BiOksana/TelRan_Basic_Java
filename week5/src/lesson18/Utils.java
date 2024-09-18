package lesson18;

import java.util.Arrays;
import java.util.Scanner;

import static lesson18.Constant.COUNT_SET_SIZE;

public class Utils {

    public static void printNumbersOfArray(int[] array, ArraysType type) {
        switch (type) {
            case USER ->  System.out.println("Numbers from user: " + Arrays.toString(array));
            case LOTTO -> System.out.println("Lucky numbers: " + Arrays.toString(array));
            case WIN -> System.out.println("Winning numbers: " + Arrays.toString(array));
        }
    }

    public static int[] getWinningNumbers() {
        int[] array = new int[COUNT_SET_SIZE];
        int index = 0;
        int number;
        while (index < COUNT_SET_SIZE) {
            number = (int) (Math.random() * 50 + 1);
            if (!isExisting(array, number)) {
                array[index] = number;
                index++;
            }
        }
        return array;
    }

    public static int[] getUserNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[COUNT_SET_SIZE];
        int index = 0;
        int number;
        System.out.println("Enter integer number from 1 to 50");
        while (index < COUNT_SET_SIZE) {
            number = scanner.nextInt();
            if (number > 0 && number <= 50) {
                if (!isExisting(array, number)) {
                    array[index] = number;
                    index++;
                } else {
                    System.out.println("Entered number exist! Try again!");
                }
            } else {
                System.out.println("Number is incorrect. Enter new number from 1 to 50: ");
            }
        }
        return array;
    }



    public static boolean isExisting(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
    public static int[] getAmountOfMatchingLotteryNumbers(int[]arrayOfLottery, int[] arrayOfUser) {
        int[] array = new int[COUNT_SET_SIZE];
        int count = 0;
        for (int number : arrayOfUser) {
                if (isExisting(arrayOfLottery, number)) {
                    array[count] = number;
                    count++;
                }
        }
        int[] winArray = new int[count];
        int i = 0;
        while (array[i] != 0) {
            winArray[i] = array[i];
            i++;
        }
        return winArray;
    }

}
