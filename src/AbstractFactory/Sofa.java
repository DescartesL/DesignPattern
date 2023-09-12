package AbstractFactory;

public class Sofa {
    private String name;
    private int price;

    public Sofa(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void useSofa(){
        System.out.println("Using " + name + " sofa");
    }
}
