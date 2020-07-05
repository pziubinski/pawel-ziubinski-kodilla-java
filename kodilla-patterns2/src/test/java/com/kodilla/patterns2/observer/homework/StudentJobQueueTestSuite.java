package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class StudentJobQueueTestSuite {
    @Test
    public void studentJobTest() {
        //GIVEN
        StudentJobQueue johnDoe = new StudentJobQueue("John Doe");
        StudentJobQueue michaelJackson = new StudentJobQueue("Michael Jackson");
        StudentJobQueue ninnyStudent = new StudentJobQueue("Ninny One");
        Mentor crudeMentor = new Mentor("Very Crude");
        Mentor politeMentor = new Mentor("Nice and Polite");

        johnDoe.registerObserver(crudeMentor);
        michaelJackson.registerObserver(politeMentor);
        ninnyStudent.registerObserver(crudeMentor);
        ninnyStudent.registerObserver(politeMentor);

        //WHEN
        johnDoe.addJob("Task 12 was completed.");
        michaelJackson.addJob("Task 10 was completed.");
        ninnyStudent.addJob("Task 3 was completed.");
        johnDoe.addJob("Task 13 was completed.");
        michaelJackson.addJob("Task 11 was completed.");
        michaelJackson.addJob("Task 12 was completed.");

        //THEN
        Assert.assertEquals(3, crudeMentor.getQueueCount());
        Assert.assertEquals(4, politeMentor.getQueueCount());
    }
}
