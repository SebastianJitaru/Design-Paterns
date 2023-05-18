package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class CompositeTask extends Task implements Observer {
    List<Task> subTasks;

    public CompositeTask() {
        this.subTasks = new ArrayList<>();
    }

    public CompositeTask(List<Task> subTasks) {
        this.subTasks = subTasks;
        for (Task subTask : subTasks) {
            subTask.addObserver(this);
        }
        updateCost();
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
            totalCost += subTask.getCost();
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

