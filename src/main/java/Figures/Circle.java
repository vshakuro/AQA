package main.java.Figures;

public class Circle implements Square{
    public String name;
    public double radius;
    public String color;
    public String borderColor;

    public Circle(String name, double radius, String color, String borderColor){
        this.name = name;
        this.radius = radius;
        this.color = color;
        this.borderColor = borderColor;
    }

    /**
     * @return double
     */
    public double calculateSquare(){
        return Math.PI * (radius * radius);
    }

    /**
     * @return String
     */
    public String getColor(){
        return color;
    }

    /**
     * @return String
     */
    public String getColorBorder(){
        return borderColor;
    }

}
