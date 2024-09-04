package lesson10.homework6;

public class CanBuyFoodClass {
    public static void main(String[] args) {

        boolean isEdekaOpen = false;
        boolean isReweOpen = true;
        System.out.println("Я могу купить еду, это " + canBuy(isEdekaOpen, isReweOpen));

    }
    public static boolean canBuy(boolean isOpenStoreOne, boolean isOpenStoreTwo) {
        return isOpenStoreOne || isOpenStoreTwo;
    }
}
