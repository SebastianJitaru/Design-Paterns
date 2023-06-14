package Examens.examen22;

public interface MachineVisitor {
    void visit(Machine maquinaSimple);

    void visit(MachineComposite  maquinaComposta);

}
