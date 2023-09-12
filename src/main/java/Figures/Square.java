package main.java.Figures;

public interface Square {
    /**
     * @return double
     */
    public double calculatePerimeter();

    /**
     * @return double
     */
    public double calculateSquare();

    /**
     * @return String
     */
    public default String setColor(){
        return setColor();
    }

    /**
     * @return String
     */
    public default String setColorBorder(){
        return setColorBorder();
    }
    public default String getName(){
        return getName();
    }
}
