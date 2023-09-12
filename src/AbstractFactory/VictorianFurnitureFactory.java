package AbstractFactory;

public class VictorianFurnitureFactory implements AbstractFurnitureFactory{

    @Override
    public Chair createChair(String name, int price) {
        return new VictorianChair(name, price);
    }

    @Override
    public Sofa createSofa(String name, int price) {
        return new VictorianSofa(name, price);
    }

}
