public abstract class Triangle extends Shape {
    protected int base;

    public Triangle(int x, int y, int h, int b) {
        super(h, x, y);
        base = b;
    }

    public double getPerimeter() {
        System.out.println("undefined");
        return -1;
    }
}
