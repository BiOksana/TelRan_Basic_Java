package eighthLesson.homeWork5;

public class First {
    public static void main(String[] args) {
        double m = 10.5;
        double n = 10.45;


        if (Math.abs(n - 10) < Math.abs(m - 10)) {
            System.out.println("Число n = " + n + " ближе к 10, чем число m = " + m);
        } else if (Math.abs(m - 10) < Math.abs(n - 10)) {
            System.out.println("Число m = " + m + " ближе к 10, чем число n = " + n);
        } else {
            System.out.println("Oба числа равноудалены");
        }
    }
}
