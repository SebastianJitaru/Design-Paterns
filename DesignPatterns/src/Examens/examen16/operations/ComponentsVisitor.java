package Examens.examen16.operations;

import Examens.examen16.Composite;
import Examens.examen16.Leaf;

public interface ComponentsVisitor {

    void visit(Leaf leaf);

    void visit(Composite composite);

}
