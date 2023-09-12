package main.java.Figures;

public class Triangle implements Square {
    public String name;
    public int sideA;
    public int sideB;
    public int sideC;
    public String color;
    public String borderColor;

    /**
     * @param name
     * @param sideA
     * @param sideB
     * @param sideC
     * @param color
     * @param borderColor
     */
    public Triangle(String name, int sideA, int sideB, int sideC, String color, String borderColor) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
        this.borderColor = borderColor;
    }

    /**
     * @return double
     */
    public double calculatePerimeter() {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    /**
     * @return double
     */
    public double calculateSquare() {
        double square = Math.sqrt(calculatePerimeter() / 2 *
                (calculatePerimeter() / 2 - sideA) *
                (calculatePerimeter() / 2 - sideB) *
                (calculatePerimeter() / 2 - sideC));
        return square;
    }

    /**
     * @return String
     */
    public String setColor() {
        return color;
    }

    /**
     * @return String
     */
    public String setColorBorder() {
        return borderColor;
    }

    /**
     * @return String
     */
    public String getName() {
        return name;
    }
}
