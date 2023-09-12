package Builder;

public class HouseBuilder implements Builder{

    private House house = new House();

    @Override
    public void reset() {
        house = new House();
    }

    @Override
    public void buildPartA() {
        house.setFloor("SmallHouse地板");
    }

    @Override
    public void buildPartB() {
        house.setWall("SmallHouse墙");
    }

    @Override
    public void buildPartC() {
        house.setRoofed("SmallHouse屋顶");
    }

    public House buildHouse(){
        return house;
    }
}
