package main.java.Figures;

public class Main {
    public static  void main (String[] args) {

        Circle circle = new Circle("Круг", 8, "Желтый", "Красный");
        System.out.println("Фигура - " + circle.name +
                "\nПериметр - " + String.format("%(.2f",
                circle.calculatePerimeterCircle(circle.radius)) +
                "; Площадь - " + String.format("%(.2f", circle.calculateSquare()) +
                "; Цвет фона - " + circle.getColor() +
                "; Цвет границ - " + circle.getColorBorder());

        Triangle triangle = new Triangle("Треугольник", 5,6,7,"Зеленый","Оранжевый");
        System.out.println("Фигура - " + triangle.name +
                "\nПериметр - " + String.format("%(.2f",
                triangle.calculatePerimeterTriangle(triangle.sideA, triangle.sideB, triangle.sideC)) +
                "; Площадь - " + String.format("%(.2f", triangle.calculateSquare()) +
                "; Цвет фона - " + triangle.getColor() +
                "; Цвет границ - " + triangle.getColorBorder());

        Rectangle rectangle = new Rectangle("Прямоугольник", 5,6,"Фиолетовый","Синий");
        System.out.println("Фигура - " + rectangle.name +
                "\nПериметр - " + String.format("%(.2f",
                rectangle.calculatePerimeterRectangle(rectangle.sideA, rectangle.sideB)) +
                "; Площадь - " + String.format("%(.2f", rectangle.calculateSquare()) +
                "; Цвет фона - " + rectangle.getColor() +
                "; Цвет границ - " + rectangle.getColorBorder());
    }
}