package Examens.examen16;

import Examens.examen16.operations.ComponentsVisitor;

public abstract class Component {

    public abstract void accept(ComponentsVisitor visitor);

    public abstract int getInfo();
}
