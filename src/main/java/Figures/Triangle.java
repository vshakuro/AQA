package main.java.Figures;

public class Triangle implements Square {
    public String name;
    public int sideA;
    public int sideB;
    public int sideC;
    public String color;
    public String borderColor;

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
    public double calculateSquare() {
        double p = calculatePerimeterTriangle(this.sideA, this.sideB,this.sideC);
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
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
