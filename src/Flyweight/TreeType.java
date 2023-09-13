package Flyweight;

public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture){
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(String canvas, int x, int y){
        System.out.println("TreeType.draw() called with: canvas = [" + canvas + "], x = [" + x + "], y = [" + y + "]");
    }
}
