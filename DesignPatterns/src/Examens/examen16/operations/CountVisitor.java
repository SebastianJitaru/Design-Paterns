package Examens.examen16.operations;

import Examens.examen16.Component;
import Examens.examen16.Composite;
import Examens.examen16.Leaf;

import java.util.List;

public class CountVisitor extends Operation {
    private int counter;

    public CountVisitor(){
        this.counter = 0;
    }
    @Override
    public void visit(Leaf leaf) {
        this.counter = 1;
    }

    @Override
    public void visit(Composite composite) {
        List<Component> list = composite.getComponents();
        counter = list.size();

    }

    public int getCounter() {
        return counter;
    }
}
