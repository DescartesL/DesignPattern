package Bridge;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(new Red());
        shape.draw();
        shape = new Circle(new Blue());
        shape.draw();
        shape = new Square(new Red());
        shape.draw();
        shape = new Square(new Blue());
        shape.draw();
    }
}
