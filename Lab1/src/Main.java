import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Завдання 7. Введіть площу квадрата: ");
        double area = scanner.nextDouble(); // Використовуємо nextDouble() для зчитування числа
        SquareCalculator.calculateSquareProperties(area);

        System.out.print("Завдання 12. Введіть тризначне число: ");
        int inputNumber = scanner.nextInt();

        try {
            ThreeDigitNumber threeDigitNumber = new ThreeDigitNumber(inputNumber);
            System.out.println("Сума цифр: " + threeDigitNumber.sumOfDigits());
            System.out.println("Добуток цифр: " + threeDigitNumber.productOfDigits());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Завдання 17. Введіть перше ціле число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введіть друге ціле число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введіть третє ціле число: ");
        int num3 = scanner.nextInt();

        System.out.print("Введіть четверте ціле число: ");
        int num4 = scanner.nextInt();

        // Виклик методу для обчислення середнього арифметичного і найближчого цілого
        AverageCalculator.calculateAverageAndNearestInteger(num1, num2, num3, num4);


        System.out.print("Введіть коефіцієнт A: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть коефіцієнт B: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть коефіцієнт C: ");
        double c = scanner.nextDouble();

        // Створення об'єкта класу QuadraticEquation
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        // Перевірка наявності цілих коренів
        if (equation.hasIntegerRoots()) {
            System.out.println("Квадратне рівняння має цілі корені.");
        } else {
            System.out.println("Квадратне рівняння не має цілих коренів.");
        }

        scanner.close(); // Закриття сканера
    }
}