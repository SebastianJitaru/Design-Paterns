package Examens.recu16;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MachineComposite extends MachineComponent implements Observer {

    private List<MachineComponent> components;

    public MachineComposite(){
        this.components = new ArrayList<>();
    }


    @Override
    public boolean isBroken() {
        for (MachineComponent component: components){
            if(component.broken){
                return true;
            }
        }
        return false;
    }
    public void addComponent(MachineComponent component){

    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
