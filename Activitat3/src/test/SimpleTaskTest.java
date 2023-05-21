package test;
import main.CompositeTask;
import main.Money;
import main.SimpleTask;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTaskTest {
    @Test
    public void testWithSimpleTasks(){
        CompositeTask project = new CompositeTask();
        project.addSubtask(new SimpleTask(new Money(100.0)));
        project.addSubtask(new SimpleTask(new Money(300.0)));

        assertEquals(400.0, project.getCostInEuros().getCostInEuros(), 0.001);

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

}
