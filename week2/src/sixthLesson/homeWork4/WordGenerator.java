package sixthLesson.homeWork4;

import java.util.Scanner;

public class WordGenerator {
    public static void main(String[] args) {
        System.out.println(generateWord());
    }

//    public static String generateWord() {
//        Scanner scanner = new Scanner(System.in);
//        String word;
//
//        String result = "";
//        for (int i = 0; i < 2; i++) {
//            System.out.println("Enter a word with an even number of letters: ");
//            word = scanner.nextLine();
//            while (word.length() % 2 != 0) {
//                System.out.println("Number of letters isn't even. Try again:");
//                word = scanner.nextLine();
//            }
//            if (i == 0) {
//                result += word.substring(0, word.length() / 2);
//            } else {
//                result += word.substring(word.length() / 2);
//            }
//
//        }
//        return result;
//    }

    public static String generateWord() {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        for (int i = 0; i < 2; i++) {
            String word = getWord(scanner);

            if (i == 0) {
                result += word.substring(0, word.length() / 2);
            } else {
                result += word.substring(word.length() / 2);
            }
        }
        return result;
    }

    public static String getWord(Scanner scanner) {
        System.out.println("Enter a word with an even number of letters: ");
        String word = scanner.nextLine();
        while (word.length() % 2 != 0) {
            System.out.println("Number of letters isn't even. Try again:");
            word = scanner.nextLine();
        }
        return word;
    }
}
