
public class Main {
    public static void main(String[] args) {
        int price = 13676; //стоимость билета
        int oneMile = 20; //количества рублей для одной бонусной мили

        int bonus;
        if (price >= oneMile) {
            bonus = price / oneMile;
        } else {
            bonus = 0;
        }
        System.out.println("Количество начисленных миль за купленный билет: " + bonus);
    }
}
