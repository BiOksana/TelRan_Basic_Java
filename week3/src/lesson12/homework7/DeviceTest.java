package lesson12.homework7;

public class DeviceTest {
    public static void main(String[] args) {
//        Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//В результате метод возвращает true или false.

        int temperature1 = 190;
        int temperature2 = 50;
        System.out.println(isCorrectWorkingDevice(temperature1, temperature2));
    }
    public static boolean isCorrectWorkingDevice(int valueOne, int valueTwo) {
        return valueOne > 100 && valueTwo < 100;
    }
}
