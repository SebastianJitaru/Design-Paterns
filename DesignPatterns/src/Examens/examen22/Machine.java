package Examens.examen22;

public class Machine extends MachineComponent{

    public void setBroken(){
        System.out.println("Setting machine to broken");
        broken = true;
    }
    public void repair(){
        System.out.println("Repairing machine");
        broken = false;
    }

}
