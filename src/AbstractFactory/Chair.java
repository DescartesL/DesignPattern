package AbstractFactory;

public class Chair {
    private String name;
    private int price;

    public Chair(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void useChair(){
        System.out.println("Using " + name + " chair");
    }

}
