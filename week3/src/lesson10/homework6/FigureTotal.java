package lesson10.homework6;

public class FigureTotal {
    public static void main(String[] args) {

        int m = 12345;
//        int m = 123456789;
        System.out.println(addAllFiguresOfNumbers(m));
    }

    public static int addAllFiguresOfNumbers(int number) {
        String strNumber = "" + number;
        int sum = 0;
        for (char ch : strNumber.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(ch));
        }
        return sum;
    }
}
