package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    protected boolean isExecuted;

    public DrivingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        executeTask();
    }

    @Override
    public void executeTask() {
        System.out.println("You should buy " + quantity + " litres of " + whatToBuy);
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
