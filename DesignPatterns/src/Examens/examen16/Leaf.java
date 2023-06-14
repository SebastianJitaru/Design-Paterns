package Examens.examen16;

import Examens.examen16.operations.ComponentsVisitor;

public class Leaf extends Component{

    private int info;

    public Leaf(int info){
        this.info =  info;
    }
    @Override
    public void accept(ComponentsVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int getInfo() {
        return info;
    }
}
