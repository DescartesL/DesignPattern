package AbstractFactory;

public class ModernSofa extends Sofa{
    public ModernSofa(String name, int price){
        super(name, price);
    }

    public void useSofa(){
        super.useSofa();
        System.out.println("This is a Modern sofa");
    }
}
