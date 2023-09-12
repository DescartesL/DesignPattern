package ProtoType;

public class Rectangle extends Shape{
    private int x;
    private int y;
    private String color;

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setColor(String c){
        this.color = c;
    }

    public Rectangle(){

    }

    public Rectangle(Rectangle rectangle){
        this();
        this.x = rectangle.x;
        this.y = rectangle.y;
        this.color = rectangle.color;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                ", hashcode='" + this.hashCode() +
                '}';
    }
}
