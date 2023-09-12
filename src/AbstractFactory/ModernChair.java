package AbstractFactory;

public class ModernChair extends Chair{

    public ModernChair(String name, int price) {
        super("Modern "+ name, price);
    }

    @Override
    public void useChair() {
        super.useChair();
        System.out.println("This is a Modern chair");
    }
}
