package main.java.Figures;

public interface Square {

    /**
     * @return double
     */
    double calculateSquare();

    /**
     * @return String
     */
    String getColor();
    /**
     * @return String
     */
    String getColorBorder();

    default double calculatePerimeterCircle(double radius){
        return Math.PI * 2 * radius;
    }

    default double calculatePerimeterRectangle(int sideA, int sideB) {
        return sideA + sideB;
    }

    default double calculatePerimeterTriangle(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }
}
