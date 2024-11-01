public class AverageCalculator {
    // Метод для обчислення середнього арифметичного і найближчого цілого
    public static void calculateAverageAndNearestInteger(int a, int b, int c, int d) {
        // Обчислюємо середнє арифметичне
        double average = (a + b + c + d) / 4.0;

        // Знаходимо найближче ціле число до середнього
        int nearestInteger = (int) Math.round(average);

        System.out.println("Середнє арифметичне: " + average);
        System.out.println("Найближче ціле число: " + nearestInteger);
    }
}