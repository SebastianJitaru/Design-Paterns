package Examens.examen16.operations;

import Examens.examen16.Component;
import Examens.examen16.Composite;
import Examens.examen16.Leaf;

public class SumVisitor extends Operation {
    private int totalSum;

    public SumVisitor(){
        this.totalSum = 0;
    }
    @Override
    public void visit(Leaf leaf) {
        this.totalSum = leaf.getInfo();
    }

    @Override
    public void visit(Composite composite) {
        for(Component component: composite.getComponents()){
            this.totalSum += component.getInfo();
        }
    }

    public int getTotalSum() {
        return totalSum;
    }
}
