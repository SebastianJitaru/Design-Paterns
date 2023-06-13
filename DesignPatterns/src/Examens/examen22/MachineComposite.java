package Examens.examen22;

import javax.crypto.Mac;
import java.util.ArrayList;
import java.util.List;

public class MachineComposite extends MachineComponent{

    private List<MachineComponent> machines = new ArrayList<MachineComponent>();

    public void addComponent(MachineComponent maquina){
        machines.add(maquina);
    }
    public void removeComponent(MachineComponent maquina){
        machines.remove(maquina);
    }

    public boolean isCompositeBroken() {
        for (MachineComponent component : machines) {
            if (component.isBroken()) {
                return true; // If any component is broken, the MachineComposite is broken
            }
        }
        return false; // If no component is broken, the MachineComposite is not broken
    }



}
