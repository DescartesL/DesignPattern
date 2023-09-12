package Builder;

public class House {
    private String floor;
    private String wall;
    private String roofed;

    public House() {
    }

    public House(String floor, String wall, String roofed) {
        this.floor = floor;
        this.wall = wall;
        this.roofed = roofed;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor='" + floor + '\'' +
                ", wall='" + wall + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }
}
