package AbstractFactory;

public interface AbstractFurnitureFactory {
    public Chair createChair(String name, int price);
    public Sofa createSofa(String name, int price);

}
