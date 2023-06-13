package Examens.examen22;

import javax.crypto.Mac;

public class Runner {
    public static void main (String[] args){
        Machine maquina1 = new Machine();
        Machine maquina2 = new Machine();

        MachineComposite composite = new MachineComposite();

        composite.addComponent(maquina1);
        composite.addComponent(maquina2);

        maquina1.setBroken();

        System.out.println("State of composite machine is: " + composite.isCompositeBroken());

        maquina1.repair();

        System.out.println("State of composite machine is: " + composite.isCompositeBroken());

    }
}
