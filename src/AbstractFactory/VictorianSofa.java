package AbstractFactory;

public class VictorianSofa extends Sofa{
    public VictorianSofa(String name, int price){
        super(name, price);
    }

    public void useSofa(){
        super.useSofa();
        System.out.println("This is a Victorian sofa");
    }


}
