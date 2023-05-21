package main;

import java.util.Observable;

public class Task extends Observable {
    protected Money cost = new Money(0.0);

    public Task (){

    }
    protected Task(Money cost) {
        if (cost.getCostInEuros() < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        this.cost = cost;
    }

    public Money getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        double oldCost = this.cost.getCostInEuros();
        this.cost.setCostInEuros(cost);
        setChanged();
        notifyObservers(new CostChanged(oldCost, cost));
    }
}