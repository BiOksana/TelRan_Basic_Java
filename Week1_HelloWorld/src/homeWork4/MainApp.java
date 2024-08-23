package homeWork4;

public class MainApp {
    public static void main(String[] args) {
        String newStr = "I study Basic Java";
        System.out.println(newStr.charAt(newStr.length() - 2));
        System.out.println("newStr.contains 'Java' : " + newStr.contains("Java"));
        System.out.println(newStr.substring(14, 18));
        System.out.println(newStr.replace('a', 'o'));
        System.out.println(newStr.toUpperCase());
        System.out.println(newStr.toLowerCase());
        printString(newStr);

        System.out.println("10 + 5 = " + add(10, 5));
        System.out.println("10 - 5 = " + subtract(10, 5));
        System.out.println("10 * 5 = " + miltiply(10, 5));
        System.out.println("10 / 5 = " + divide(10, 5));

    }

    public static void printString(String str) {
        System.out.println(str);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int miltiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
