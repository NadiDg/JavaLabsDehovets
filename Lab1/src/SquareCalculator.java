public class SquareCalculator {
    // Метод для обчислення властивостей квадрата
    public static void calculateSquareProperties(double area) {
        double side = Math.sqrt(area); // Знаходимо сторону квадрата

        // Знаходимо мінімальну цілу сторону квадрата для вписування
        int minEnclosingSide = (int) Math.ceil(side * Math.sqrt(2));

        System.out.println("Сторона квадрата: " + side);
        System.out.println("Мінімальна ціла сторона квадрата для вписування: " + minEnclosingSide);
    }

    public static class DigitOperations {
    }
}