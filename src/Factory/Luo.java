package Factory;

public class Luo extends Product{
    private String name;
    private int price;

    public Luo(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void use(){
        System.out.println( "name:"+ this.name + ", price:" + this.price + "been Using Luo");
    }
}
