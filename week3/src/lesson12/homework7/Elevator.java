package lesson12.homework7;

public class Elevator {
    public static void main(String[] args) {

        System.out.println("Kоличество подъемов, которые понадобятся лифту = " + numberOfLifts(200, 50, 1));
    }

    public static int numberOfLifts(int floor, int stepUp, int stepDown) {
        int currentFloor = 0;
        int count = 0;
        while (currentFloor <= floor) {
            currentFloor += stepUp - stepDown;
            count++;
        }
        return count;
    }
}
