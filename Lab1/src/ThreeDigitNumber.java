
public class ThreeDigitNumber {
    private int number;

    public ThreeDigitNumber(int number) {
        if (number < 100 || number > 999) {
            throw new IllegalArgumentException("Число повинно бути тризначним.");
        }
        this.number = number;
    }

    public int sumOfDigits() {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum += temp % 10; // Додаємо останню цифру
            temp /= 10; // Видаляємо останню цифру
        }

        return sum;
    }

    public int productOfDigits() {
        int product = 1;
        int temp = number;

        while (temp > 0) {
            product *= temp % 10; // Множимо останню цифру
            temp /= 10; // Видаляємо останню цифру
        }

        return product;
    }
}
