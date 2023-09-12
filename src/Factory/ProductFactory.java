package Factory;

public class ProductFactory {

    public static Product createProduct(ProductName type, String name, int price){
        switch (type) {
            case GONG:
                return new Gong(name, price);
            case LUO:
                return new Luo(name, price);
            default:
                return null;
        }
    }

}
