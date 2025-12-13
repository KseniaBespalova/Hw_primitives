public class Main {
    public static void main(String[] args) {

        int x = 14_588; // стоимость билета
        int y = 20; // количество рублей для одной бонусной мили

        System.out.println("Количество начисленных миль за купленный билет:");
        System.out.println((x / y) + " бонусов");
    }
}