package main.java.Figures;

public class Main {
    public static  void main (String[] args) {
        Square[] figures = new Square[3];

        figures [0] = new Circle("Круг",10,"Желтый","Красный");
        figures [1] = new Triangle("Треугольник",5,6,7,"Зеленый","Оранжевый");
        figures [2] = new Rectangle("Прямоугольник",10,20,"Красный","Синий");

        for (Square tempFigure : figures){
            System.out.println("Фигура - " + tempFigure.getName() +
                    "\nПериметр - " + tempFigure.calculatePerimeter() +
                    ", Площадь - " + tempFigure.calculateSquare() +
                    ", Цвет фона - " + tempFigure.setColor() +
                    ", Цвет границ - " + tempFigure.setColorBorder());
        }

    }
}

