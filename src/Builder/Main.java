package Builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new HouseBuilder();
        Builder bighouseBuilder = new BigHouseBuilder();
        Director director = new Director(builder);
        House samllHouse = director.construct();
        director.setBuilder(bighouseBuilder);
        House bigHouse = director.construct();
        System.out.println(samllHouse);
        System.out.println(bigHouse);
    }
}
