public class Main {
    public static void main(String[] args) {
        int account = 100;
        int transfer = 1100;
        int bonus = 0;
        if (transfer > 1000) {
            bonus = transfer / 100;

        }
        account = account + transfer + bonus;

        System.out.println("Итоговый счет: " + account);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}