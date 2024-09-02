package eighthLesson.homeWork5;

public class Second {
    public static void main(String[] args) {

        int seconds = (int)(Math.random() * 28800);
        int hours = seconds / 60 / 60;
        System.out.println("до конца рабочего дня осталось " + seconds + " секунд");
        System.out.println("до конца рабочего дня осталось " + hours + " часа " + (seconds - hours * 60 * 60) / 60
                + " минут " + seconds % 60 + " секунд");
    }
}
