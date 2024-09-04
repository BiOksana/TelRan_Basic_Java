package lesson10.homework6;

import java.util.Scanner;

public class MinimalNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 integer number without space: ");
        String numberStr = scanner.nextLine();
        int numberInt = Integer.parseInt(numberStr);
        System.out.println(numberInt);
        int min = numberInt / 100;
        int firstComparableNumber = numberInt / 10 % 10;
        int secondComparableNumber = numberInt % 10;
        if (min >= firstComparableNumber && min >= secondComparableNumber) {
            if (firstComparableNumber > secondComparableNumber) {
                min = secondComparableNumber;
            } else {
                min = firstComparableNumber;
            }
        } else if (min > firstComparableNumber) {
            min = firstComparableNumber;
        } else if (min < firstComparableNumber && min > secondComparableNumber) {
            min = secondComparableNumber;
        }
        System.out.println("min figure of number " + numberInt + " is " + min);

    }
}
