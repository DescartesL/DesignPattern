package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.setFactory(new VictorianFurnitureFactory());
        Chair chair = app.buildChair("Victorian Chair", 100);
        Sofa sofa = app.buildSofa("Victorian Sofa", 200);
        chair.useChair();
        sofa.useSofa();

        app.setFactory(new ModernFurnitureFactory());
        chair = app.buildChair("Modern Chair", 100);
        sofa = app.buildSofa("Modern Sofa", 200);
        chair.useChair();
        sofa.useSofa();

    }
}
