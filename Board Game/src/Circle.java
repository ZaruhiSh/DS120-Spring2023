public class Circle extends Shape {
    protected int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(int x, int y, int r) {
        super(2 * r, x, y);
        radius = r;
    }

    public double getPerimeter() {
        System.out.println("get perimeter for Triangle");
        return this.height * 3.14;
    }

    public double getArea() {
        return 3.14 * height/2 * height/2;
    }

    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (! (o instanceof Circle)) {
            return false;
        }

        return this.radius == ((Circle) o).getRadius();
    }

}
