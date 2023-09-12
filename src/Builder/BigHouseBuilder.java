package Builder;

public class BigHouseBuilder implements Builder{

    private House house;

    @Override
    public void reset() {
        house = new House();
    }

    @Override
    public void buildPartA() {
        house.setFloor("BigHouse地板");
    }

    @Override
    public void buildPartB() {
        house.setWall("BigHouse墙");
    }

    @Override
    public void buildPartC() {
        house.setRoofed("BigHouse屋顶");
    }

    @Override
    public House buildHouse() {
        return house;
    }
}
