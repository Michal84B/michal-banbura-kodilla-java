package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();

        //Then
        Assert.assertEquals("Buy car", shoppingTask.getTaskName());
    }
}
