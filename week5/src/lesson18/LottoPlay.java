package lesson18;

public class LottoPlay {
    public static void main(String[] args) {
        Lotto lotto1 = new Lotto("Vasya");
        Lotto lotto2 = new Lotto("Ostap");
        Lotto lotto3 = new Lotto("Petro");
        lotto1.run();
        lotto2.run();
        lotto3.run();
    }
}
