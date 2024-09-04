package lesson10.homework6;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeap());

    }

    public static boolean isLeap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Year " + year + " is leap: ");
        return  year % 100 != 0 && year % 4 == 0 ||  year % 400 == 0;
    }
}
