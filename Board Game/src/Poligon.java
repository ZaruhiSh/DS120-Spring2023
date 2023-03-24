public class Poligon extends Shape {
    private Shape[] shapes;
    private int counter = 0;
    // Opt Ex1 example
    public Poligon(int x, int y, Shape[] shapes) {
        super(x, y);
        this.shapes = new Shape[15];

    }

    //Opt Ex1 example
    public void addShape(Shape s) {
        if (counter == shapes.length) {
            System.out.println("The polygon has reached its capacity");
        }
        shapes[counter] = s;
        counter++;
    }


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }


}
