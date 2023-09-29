package main.java.Figures;

public class Rectangle implements Square {
    public String name;
    public int sideA;
    public int sideB;
    public String color;
    public String borderColor;

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
    public double calculateSquare() {
        return sideA * sideB;
    }

    /**
     * @return String
     */
    public String getColor() {
        return color;
    }

    /**
     * @return String
     */
    public String getColorBorder() {
        return borderColor;
    }

}
