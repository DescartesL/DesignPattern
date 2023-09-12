package Factory;

public class Gong extends Product{
    private String name;
    private int price;

    public Gong(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void use(){
        System.out.println( "name:"+ this.name + ", price:" + this.price + "been Using Gong");
    }
}
