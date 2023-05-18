package main;

import main.java.CompositeTask;

import java.util.List;
import java.util.Observable;

public class MyCompositeTask extends CompositeTask {
    public MyCompositeTask(List<Task> subTasks) {
        super(subTasks);
    }

    @Override
    public void update(Observable o, Object arg) {
        // implementation for update method
    }

    @Override
    public void addSubtask(Task subTask) {
        super.addSubtask(subTask);
    }
    @Override
    public void removeSubtask(Task subTask) {
        super.removeSubtask(subTask);
    }
}
