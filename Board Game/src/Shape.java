public abstract class Shape {
    private int x;
    protected int y;
    protected int height;
    protected String color = "white";

    public Shape() {
        x = 0;
        y = 0;
        height = 0;
        System.out.println("Default constructor for shape");
    }

    public Shape(int h, int x, int y) {
        height = h;
        this.x = x;
        this.y = y;
    }

    public Shape(int x, int y) {
        height = 0;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public final void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getPerimeter();

    public abstract double getArea();
}
