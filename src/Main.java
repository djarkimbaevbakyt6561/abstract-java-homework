import figures.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(16);
        System.out.println("Периметр квадрата " + square.getPerimeter());

        Triangle triangle = new Triangle(16, 14, 12);
        System.out.println("Периметр треугольника " + triangle.getPerimeter());

        Rectangle rectangle = new Rectangle(16, 18);
        System.out.println("Периметр прямоугольника " + rectangle.getPerimeter());

        Pentagon pentagon = new Pentagon(16, 14, 12, 19 , 8);
        System.out.println("Периметр пятиугольника " + pentagon.getPerimeter());

        Hexagon hexagon = new Hexagon(16, 13,2,35,55,53);
        System.out.println("Периметр шестиугольника " + hexagon.getPerimeter());
    }
}