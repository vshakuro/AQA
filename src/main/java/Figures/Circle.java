package main.java.Figures;

public class Circle implements Square{
    public String name;
    public double radius;
    public String color;
    public String borderColor;

    /**
     * @param name
     * @param radius
     * @param color
     * @param borderColor
     */
    public Circle(String name, double radius, String color, String borderColor){
        this.name = name;
        this.radius = radius;
        this.color = color;
        this.borderColor = borderColor;
    }

    /**
     * @return double
     */
    @Override
    public double calculatePerimeter(){
        double circleSquare = Math.PI * 2*radius;
        return circleSquare;
    }

    /**
     * @return double
     */
    public double calculateSquare(){
        double circleSquare = Math.PI * (radius * radius);
        return circleSquare;
    }

    /**
     * @return String
     */
    public String setColor(){
        return color;
    }

    /**
     * @return String
     */
    public String setColorBorder(){
        return borderColor;
    }

    /**
     * @return String
     */
    public String getName(){
        return name;
    }
}
