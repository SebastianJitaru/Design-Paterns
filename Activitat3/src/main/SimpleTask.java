package main;

public class SimpleTask extends Task {
    public SimpleTask(int cost) {
        super(cost);
    }

    public void changeCost(int newCost) {
        setCost(newCost);
    }
}