package lesson18;

public class Lotto {
    private String name;

    public Lotto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run() {
        System.out.println("Lotto from " + name + ": ");
        int[] arrayFromUser = Utils.getUserNumbers();
        Utils.printNumbersOfArray(arrayFromUser, ArraysType.USER);
        int[] arrayOfWinningNumbers = Utils.getWinningNumbers();
        Utils.printNumbersOfArray(arrayOfWinningNumbers, ArraysType.LOTTO);
        int[] winArray = Utils.getAmountOfMatchingLotteryNumbers(arrayFromUser, arrayOfWinningNumbers);
        Utils.printNumbersOfArray(winArray, ArraysType.WIN);
    }
}
