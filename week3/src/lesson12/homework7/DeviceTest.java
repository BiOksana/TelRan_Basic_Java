package lesson12.homework7;

public class DeviceTest {
    public static void main(String[] args) {

        int temperature1 = 190;
        int temperature2 = 50;
        System.out.println(isCorrectWorkingDevice(temperature1, temperature2));
    }
    public static boolean isCorrectWorkingDevice(int valueOne, int valueTwo) {
        return valueOne > 100 && valueTwo < 100;
    }
}
