package AbstractFactory;

public class ModernFurnitureFactory implements AbstractFurnitureFactory{

    @Override
    public Chair createChair(String name, int price) {
        return new ModernChair(name, price);
    }

    @Override
    public Sofa createSofa(String name, int price) {
        return new ModernSofa(name, price);
    }

}
