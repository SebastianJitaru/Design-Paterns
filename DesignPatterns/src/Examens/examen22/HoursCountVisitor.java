package Examens.examen22;

public class HoursCountVisitor implements MachineVisitor{
    private int count;
    private int threshold;

    public HoursCountVisitor(int threshold) {
        this.threshold = threshold;
    }
    public int getCount(){
        return count;
    }
    @Override
    public void visit(Machine machine) {
        if (machine.getHours() > threshold) {
            count++;
        }
    }

    @Override
    public void visit(MachineComposite machineComposite) {
        for (MachineComponent component : machineComposite.getMachines()) {
            component.accept(this);
        }
    }
}
