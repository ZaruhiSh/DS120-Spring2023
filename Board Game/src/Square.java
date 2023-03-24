public class Square extends Shape implements Rotatable {
    public Square(int h, int x, int y) {
        super(h, x, y);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void rotate(int angle) {

    }
}
