package org.example;


public class Square implements SquareOperations {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    @Override
    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона має бути додатньою");
        }
        this.side = side;
    }

    @Override
    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Площа { Сторона =" + side + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(side);
    }
}



