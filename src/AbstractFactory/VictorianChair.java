package AbstractFactory;

public class VictorianChair extends Chair{

    public VictorianChair(String name, int price) {
        super("Victorian " + name, price);
    }

    @Override
    public void useChair() {
        super.useChair();
        System.out.println("This is a Victorian chair");
    }
}
