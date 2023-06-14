package Examens.examen17.ex2;

import Examens.examen17.MachineComponent;

import javax.crypto.Mac;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Register {
    public static final Register INSTANCE = new Register();
    private final Map<String,MachineComponent> machines;

    public Register() {
        machines = new HashMap<>();
    }

   public void addComponent(String name, MachineComponent component){
        machines.put(name,component);
   }
   public void getComponent(String name){
        machines.get(name);
   }

}
