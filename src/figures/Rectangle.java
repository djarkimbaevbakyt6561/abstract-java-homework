package figures;

public class Rectangle extends Shape {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return a * 2 + b * 2;
    }
}
