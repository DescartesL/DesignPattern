package ProtoType;

public class Circle extends Shape{
    private int radius;
    private String color;

    public void setRadius(int r){
        this.radius = r;
    }

    public void setColor(String c){
        this.color = c;
    }

    public Circle(){

    }

    public Circle(Circle circle){
        this();
        this.radius = circle.radius;
        this.color = circle.color;
    }

    public Shape clone(){
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", hashcode='" + this.hashCode() +
                '}';
    }
}
