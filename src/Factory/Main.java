package Factory;

public class Main {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        Product product1 = factory.createProduct(ProductName.GONG, "Gong", 1);
        Product product2 = factory.createProduct(ProductName.LUO, "Luo", 2);
        product1.use();
        product2.use();
    }
}
