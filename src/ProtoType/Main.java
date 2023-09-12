package ProtoType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Rectangle rectangle = new Rectangle();
        rectangle.setX(1);
        rectangle.setY(2);
        rectangle.setColor("red");
        shapes.add(rectangle);
        Circle circle = new Circle();
        circle.setRadius(3);
        circle.setColor("blue");
        shapes.add(circle);
        List<Shape> shapesCopy = new ArrayList<>();
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }
        System.out.println("原型：");
        for(Shape shape : shapes){
            System.out.println(shape);
        }

        System.out.println("复制：");
        for (Shape shape : shapesCopy) {
            System.out.println(shape);
        }

    }
}
