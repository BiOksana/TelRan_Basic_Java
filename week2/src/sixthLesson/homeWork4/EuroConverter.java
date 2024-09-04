package sixthLesson.homeWork4;

import java.util.Scanner;

public class EuroConverter {
    private static double euroToUsdRate = 1.118;
    public static void main(String[] args) {
      printAmountEurosInDollars();
    }

    public static double getAmountOfEuros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of euros: ");
        return scanner.nextDouble();
    }
    public static double convertEurosToDollars() {
        return Math.round(getAmountOfEuros() * euroToUsdRate);
    }

    public static void printAmountEurosInDollars() {
        System.out.println("Your amount in euros equals " + convertEurosToDollars() + " dollars");
    }
}
