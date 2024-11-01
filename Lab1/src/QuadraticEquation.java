public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    // Конструктор класу
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Метод для обчислення дискримінанта
    public double calculateDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Метод для перевірки наявності цілих коренів
    public boolean hasIntegerRoots() {
        double discriminant = calculateDiscriminant();

        if (discriminant < 0) {
            return false; // Немає коренів
        }

        // Обчислення коренів
        double sqrtDiscriminant = Math.sqrt(discriminant);
        double root1 = (-b + sqrtDiscriminant) / (2 * a);
        double root2 = (-b - sqrtDiscriminant) / (2 * a);

        // Перевірка, чи є корені цілими
        return (root1 == (int) root1) && (root2 == (int) root2);
    }
}