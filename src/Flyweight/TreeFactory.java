package Flyweight;

import java.util.List;

public class TreeFactory {
    private List<TreeType> treeTypes;

    public static TreeType getTreeType(String name, String color, String texture){
        if(treeTypes.contains(new TreeType(name, color, texture))){
            return treeTypes.get(treeTypes.indexOf(new TreeType(name, color, texture)));
        }
        TreeType treeType = new TreeType(name, color, texture);
        treeTypes.add(treeType);
        return treeType;
    }
}
