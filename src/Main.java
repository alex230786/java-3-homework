// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int replenishmentAmount = 1100;
        int amoutOnAccount = 100;
        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
                            } else {
            bonus = 0;
        }
        int total = amoutOnAccount + replenishmentAmount + bonus;

        System.out.println("Сумма на счету: " +total);
    }
}