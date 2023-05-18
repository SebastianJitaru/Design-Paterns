package main;

import java.util.Observable;

public abstract class Task extends Observable {
    protected int cost;

    public Task (){

    }
    protected Task(int cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        int oldCost = this.cost;
        this.cost = cost;
        setChanged();
        notifyObservers(new CostChanged(oldCost, cost));
    }

    public final int costInEuros() {
        return this.cost;
    }
}