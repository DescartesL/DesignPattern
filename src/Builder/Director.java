package Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public House construct(){
        builder.reset();
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.buildHouse();
    }
}
