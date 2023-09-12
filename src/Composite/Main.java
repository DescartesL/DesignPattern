package Composite;

public class Main {
    public static void main(String[] args) {
        CompoundGraphic graphic = new CompoundGraphic();
        graphic.add(new Dot(1, 2));
        graphic.add(new Circle(5, 3, 10));
        graphic.add(new Circle(2, 2, 5));
        graphic.add(new Dot(3, 3));

        System.out.println("Fist draw:");
        graphic.draw();
        graphic.move(1,1);

        System.out.println("After move:");
        graphic.draw();
    }
}
