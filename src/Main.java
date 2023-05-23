// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int replenishment_amount = 1100;
        int amout_on_account = 100;
        int bonus;
        if (replenishment_amount > 1000) {
            bonus = replenishment_amount / 100;
                            } else {
            bonus = 0;
        }
        int total = amout_on_account + replenishment_amount + bonus;

        System.out.println("Сумма на счету: " +total);
    }
}