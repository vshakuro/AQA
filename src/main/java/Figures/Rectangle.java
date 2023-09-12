package main.java.Figures;

public class Rectangle implements Square {
    public String name;
    public int sideA;
    public int sideB;
    public String color;
    public String borderColor;

    /**
     * @param name
     * @param sideA
     * @param sideB
     * @param color
     * @param borderColor
     */
    public Rectangle(String name, int sideA, int sideB, String color, String borderColor) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
        this.borderColor = borderColor;
    }

    /**
     * @return double
     */
    public double calculatePerimeter() {
        double perimeter = sideA + sideB;
        return perimeter;
    }

    /**
     * @return double
     */
    public double calculateSquare() {
        double square = sideA * sideB;
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
