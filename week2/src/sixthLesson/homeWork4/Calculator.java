package sixthLesson.homeWork4;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("10 + 5 = " + addMethod(10, 5));
        System.out.println("10 - 5 = " + subtractMethod(10, 5));
        System.out.println("10 * 5 = " + multiplyMethod(10, 5));
        System.out.println("10 / 5 = " + divideMethod(10, 5));
    }

    public static int addMethod(int a, int b) {
        return a + b;
    }

    public static int subtractMethod(int a, int b) {
        return a - b;
    }

    public static int multiplyMethod(int a, int b) {
        return a * b;
    }

    public static int divideMethod(int a, int b) {
        return a / b;
    }

}
