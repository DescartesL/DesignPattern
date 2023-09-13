package Flyweight;

public class Forest {
    public void plantTree(int x, int y, String name, String color, String texture){
        TreeType treeType = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, treeType);
        tree.draw("canvas");
    }

    
}
