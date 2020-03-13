package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.executeTask(TaskEnumeration.SHOPPING);

        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("Shopping List", shopping.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.executeTask(TaskEnumeration.PAINTING);

        //Then
        Assert.assertTrue(painting.isTaskExecuted());
        Assert.assertEquals("Painting List", painting.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.executeTask(TaskEnumeration.DRIVING);

        //Then
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("Driving List", driving.getTaskName());
    }
}