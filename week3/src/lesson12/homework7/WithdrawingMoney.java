package lesson12.homework7;

public class WithdrawingMoney {
    public static void main(String[] args) {

        System.out.println(getNumberOfDays(21));
    }

    public static int getNumberOfDays(int account) {
        int count = 0;
        while (account > 0) {
            for (int i = account - 1; i > 0; i--) {
                if (account % i == 0) {
                    account -= i;
                    System.out.println("Снято " + i + ", осталось = " + account);
                    count++;
                    break;
                }
            }
            if (account == 1) {
                account -= 1;
                System.out.println("Снято 1, осталось = " + account);
                count++;
            }
        }
        return count;
    }
}
