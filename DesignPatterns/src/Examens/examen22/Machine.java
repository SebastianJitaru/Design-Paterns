package Examens.examen22;

public class Machine extends MachineComponent{

    private int hours = 3;

    public void setBroken(){
        System.out.println("Setting machine to broken");
        broken = true;
    }
    public void repair(){
        System.out.println("Repairing machine");
        broken = false;
    }

    public int getHours(){
        return hours;
    }

    public void setHours(int hours){this.hours = hours;}
    @Override
    public void accept(MachineVisitor visitor) {
        visitor.visit(this);
    }
}
