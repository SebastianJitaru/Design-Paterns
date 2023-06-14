package Examens.examen17;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MachineComposite extends MachineComponent implements Observer {

    MachineCompositeObservable observable;

    private List<MachineComponent> components;
    public MachineComposite(long id) {
        super(id);
        this.components = new ArrayList<>();
        this.observable = new MachineCompositeObservable();
    }
    public void addObserver(Observer o) {
        observable.addObserver(o);
    }
    public void deleteObserver(Observer o) {
        observable.deleteObserver(o);
    }
    public void notifyObservers() {
        observable.notifyObservers();
    }
    public void notifyObservers(Object arg) {
        observable.notifyObservers(arg);
    }
    public void deleteObservers() {
        observable.deleteObservers();
    }
    protected void setChanged() {
        observable.setChanged();
    }
    protected void clearChanged() {
        observable.clearChanged();
    }
    public boolean hasChanged() {
        return observable.hasChanged();
    }
    public int countObservers() {
        return observable.countObservers();
    }
    public void addComponent(MachineComponent component){
        components.add(component);
        setChanged();
        notifyObservers();
    }
    @Override
    public void update(Observable o, Object arg) {
        setChanged();
        notifyObservers(arg);
    }
    private static class MachineCompositeObservable extends Observable {
        @Override
        public void setChanged() {
            super.setChanged();
        }
        @Override
        public void clearChanged() {
            super.clearChanged();
        }
    }
}
