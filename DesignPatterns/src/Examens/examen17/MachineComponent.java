package Examens.examen17;

import java.util.Observable;

public class MachineComponent {
    private final long id;
    public MachineComponent(long id) {
        this.id = id;
    }

    public long getId(){
        return id;
    }
}
