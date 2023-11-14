package figures;

public class Pentagon extends Shape {
    int a;
    int b;
    int c;
    int d;
    int e;

    public Pentagon(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d + e;
    }
}
