package AbstractFactory;

public class Application {
    private AbstractFurnitureFactory factory;


    public void setFactory(AbstractFurnitureFactory factory) {
        this.factory = factory;
    }

    public Chair  buildChair(String name, int price){
        return factory.createChair(name, price);
    }

    public Sofa buildSofa(String name, int price){
        return factory.createSofa(name, price);
    }
}
