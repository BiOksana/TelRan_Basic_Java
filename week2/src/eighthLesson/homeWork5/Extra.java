package eighthLesson.homeWork5;

public class Extra {
    public static void main(String[] args) {

        System.out.println(getSalaryPerWeek(15, 48.5));

    }

    public static double getSalaryPerWeek (double salaryPerHour, double time) {
        double salary = 0.0;
        if (time <= 60 && salaryPerHour >= 8) {
            if (time > 40) {
                salary = ((time - 40) * 1.5 + 40) * salaryPerHour;
            } else {
                salary = salaryPerHour * time;
            }
        } else {
            System.out.println("Labour law is violated");
        }
        return salary;
    }
}
