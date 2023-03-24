public class Main {
    public static void main(String[] args) {
        BoardGame g = new BoardGame();
        g.getAllShapePerimeters();
        g.display();
        g.addShape("Triangle", 5, 5, 10, 11);
        int triangleCount = g.findSimilarShapes("Triangle");
        int squareCount = g.findSimilarShapes("Square");
        System.out.println("There are " + triangleCount );
        Circle c1 = new Circle(5, 20, 100);
        Circle c2 = new Circle(5, 20, 101);
        c2 = c1;
        if (c1.equals(c1)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
