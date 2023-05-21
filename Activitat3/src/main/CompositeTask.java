package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class CompositeTask extends Task implements Observer {
    List<Task> subTasks;
    Money cost;
    public CompositeTask() {
        this.cost = new Money(0);
        this.subTasks = new ArrayList<>();
    }

    public Money getCostInEuros() {
        Money cost = new Money(0);
        for (Task t : subTasks) {
            cost.add(t.getCost());
        }
        return cost;
    }
    public void addSubtask(Task subTask) {
        subTasks.add(subTask);
        subTask.addObserver(this);
        updateCost();
    }

    public void removeSubtask(Task subTask) {
        subTasks.remove(subTask);
        subTask.deleteObserver(this);
        updateCost();
    }

    private void updateCost() {
        int totalCost = 0;
        for (Task subTask : subTasks) {
            totalCost += subTask.getCost().getCostInEuros();
        }
        setCost(totalCost);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof CostChanged) {
            updateCost();
        }
    }
}

