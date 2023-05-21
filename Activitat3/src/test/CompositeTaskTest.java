package test;
import main.CompositeTask;
import main.Money;
import main.SimpleTask;
import org.junit.Test;

import java.lang.ref.PhantomReference;

import static org.junit.Assert.assertEquals;

public class CompositeTaskTest {
    @Test
    public void testWithCompositeTasks(){
        CompositeTask project = new CompositeTask();
        project.addSubtask(new SimpleTask(new Money(100.0)));
        project.addSubtask(new SimpleTask(new Money(300.0)));

        CompositeTask project2 =  new CompositeTask();
        project2.addSubtask(project);
        project2.addSubtask(new SimpleTask(new Money(300.0)));
        assertEquals(700.0, project2.getCostInEuros().getCostInEuros(), 0.001);

    }
    @Test
    public void testWithCompositeTasksRemove(){
        CompositeTask project = new CompositeTask();
        SimpleTask task1 = new SimpleTask(new Money(100.0));
        project.addSubtask(task1);
        project.addSubtask(new SimpleTask(new Money(300.0)));

        CompositeTask project2 =  new CompositeTask();
        project2.addSubtask(project);
        project2.addSubtask(new SimpleTask(new Money(300.0)));
        assertEquals(700.0, project2.getCostInEuros().getCostInEuros(), 0.001);
        project.removeSubtask(task1);
        assertEquals(600.0,project2.getCostInEuros().getCostInEuros(), 0.001);

    }
    @Test
    public void testUpdateabilityCost(){//if simpleTaskCost Updated, Composite cost updates its cost?
        CompositeTask project = new CompositeTask();
        project.addSubtask(new SimpleTask(new Money(100.0)));
        SimpleTask task1 = new SimpleTask(new Money(300.0));
        project.addSubtask(task1);
        task1.changeCost(10.0);
        assertEquals(110.0, project.getCostInEuros().getCostInEuros(), 0.001);
    }
    @Test
    public void testRemovedTask(){
        CompositeTask project = new CompositeTask();
        project.addSubtask(new SimpleTask(new Money(100.0)));
        SimpleTask task1 = new SimpleTask(new Money(300.0));
        project.addSubtask(task1);
        task1.changeCost(10.0);
        project.removeSubtask(task1);
        assertEquals(100, project.getCostInEuros().getCostInEuros(), 0.001);

    }

}
