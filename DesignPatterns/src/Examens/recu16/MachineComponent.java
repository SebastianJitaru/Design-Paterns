package Examens.recu16;

import java.util.Observable;

public abstract class MachineComponent extends Observable{
    boolean broken = false;

    public void setBroken(){
        boolean previousState = broken;
        broken = true;
        if(!previousState){
            setChanged();
            notifyObservers();
        }
    }

    public void repair(){
        boolean previousState = broken;
        broken = true;
        if(previousState){
            setChanged();
            notifyObservers();
        }
    }

    public abstract boolean isBroken();

}


