public class BoardGame {
    private int height = 100;
    private int width = 200;
    private Shape[] shapes;
    private int level = 0;

    public BoardGame(){
        shapes = new Shape[4];
        shapes[0] = new IsosceleceTriangle(10, 4, 0, 100);
        shapes[1] = new Circle(5, 20, 100);
        shapes[2] = new Square(10, 40, 100);
        shapes[3] = new Square(10, 40, 100);
        Poligon p = new Poligon(12, 15, shapes);
    }

    public void addShape(String type, int h, int w) {
        if (type == "Triangle") {
            Triangle t = new IsosceleceTriangle(0, 0, h, w);
            Shape[] newHolder = new Shape[shapes.length + 1];
            for (int i = 0; i < shapes.length; i++) {
                newHolder[0] = shapes[0];
            }
            newHolder[newHolder.length - 1] = t;
            shapes = newHolder;
        } else if (type == "Square") {

        }
    }

    public void addShape(String type, int h, int w, int x, int y) {

    }

    public BoardGame(int level) {

//        if (level == 0) {
//            shapes = new Shape[3];
//            shapes[0] = new Shape("Triangle", 10, 0, 100);
//            shapes[1] = new Shape("Circle", 10, 20, 100);
//            shapes[2] = new Shape("Square", 10, 40, 100);
//        }
//        if (level == 1) {
//            //TODO
//        }

    }

    public void getAllShapePerimeters() {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getPerimeter());
        }
    }

    public void display() {
        System.out.println("Here are all the shapes on the board");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].getClass());
            System.out.println(shapes[i].toString());
        }
    }

    public int findTriangles() {
        int counter = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Triangle) {
                counter++;
            }
        }
        return counter;
    }

    public int findSquares() {
        int counter = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Square) {
                counter++;
            }
        }
        return counter;
    }

    public int findSimilarShapes(String type) {
        int counter = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (type == "Triangle" && shapes[i] instanceof Triangle) {
                counter++;
            }
            if (type == "Square" && shapes[i] instanceof Square) {
                counter++;
            }
            if (type == "Circle" && shapes[i] instanceof Circle) {
                counter++;
            }
        }
        return 0;
    }

    public int findSimilarShapes(Shape s) {
        int counter = 0;
        for (int i = 0; i < shapes.length; i++) {

        }
        return 0;
    }

}
