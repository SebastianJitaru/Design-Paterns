package Examens.examen17.ex2;

import Examens.examen17.MachineComponent;

import java.util.HashMap;
import java.util.Map;

public class RegisterLazyImplementation {
    private static RegisterLazyImplementation INSTANCE = null;

    private final Map<String, MachineComponent> machines;


    public RegisterLazyImplementation() {
        this.machines = new HashMap<>();
    }

    public synchronized RegisterLazyImplementation getInstance(){
        if(INSTANCE == null){
            INSTANCE = new RegisterLazyImplementation();
        }
        return INSTANCE;
    }
}
