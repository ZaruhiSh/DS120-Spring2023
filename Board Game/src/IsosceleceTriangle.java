public class IsosceleceTriangle extends Triangle {
    protected int height;

    public IsosceleceTriangle(int x, int y, int h, int b) {
        super(h, x, y, b);

    }



    public double getArea() {
        System.out.println("undefined");
        return -1;
    }

    public String toString() {
        return "Isosceles Triangle with base " + base + " and  height " + getHeight();
    }
}
