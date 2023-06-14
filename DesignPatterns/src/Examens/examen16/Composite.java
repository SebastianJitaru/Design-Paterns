package Examens.examen16;

import Examens.examen16.operations.ComponentsVisitor;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

    private List<Component> leafs;
    private int info;

    public Composite(){
        this.info = 0;
        this.leafs = new ArrayList<>();
    }

    public void addLeaf(Component leaf){
        leafs.add(leaf);
    }
    @Override

    public int getInfo() {
        for(Component leaf: leafs){
            this.info += leaf.getInfo();
        }
        return this.info;
    }

    public List<Component> getComponents(){
        return leafs;
    }

    @Override
    public void accept(ComponentsVisitor visitor) {
        visitor.visit(this);
    }
}
