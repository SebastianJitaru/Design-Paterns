package Examens.examen22;

public class Runner {
    public static void main (String[] args){
        Machine maquina1 = new Machine();
        Machine maquina2 = new Machine();

        maquina2.setHours(10);
        maquina1.setHours(90);
        MachineComposite composite = new MachineComposite();

        composite.addComponent(maquina1);
        composite.addComponent(maquina2);

        HoursCountVisitor visitor = new HoursCountVisitor(30);

        composite.accept(visitor);

        System.out.println("Number of machines surpassing the threshold is "+visitor.getCount());

    }
}
