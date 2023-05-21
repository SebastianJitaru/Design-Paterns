package main;

public class SimpleTask extends Task {
    public SimpleTask(Money cost) {
        this.cost = cost;
    }

    public void changeCost(double newCost) {
        setCost(newCost);
    }
}