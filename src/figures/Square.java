package figures;

public class Square extends Shape {
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return a * 4;
    }
}
