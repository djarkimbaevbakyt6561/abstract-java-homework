package figures;

public class Hexagon extends Shape {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;

    public Hexagon(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d + e + f;
    }
}
