package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic{


    private List<Graphic> children;

    public CompoundGraphic(){
        this.children = new ArrayList<>();
    }

    public void add(Graphic g){
        children.add(g);
    }

    public void remove(Graphic g){
        children.remove(g);
    }

    @Override
    public void move(int x, int y){
        for(Graphic g : children){
            g.move(x, y);
        }
    }

    @Override
    public void draw() {
        for(Graphic g : children){
            g.draw();
        }
    }
}
