package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    protected boolean isExecuted;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        executeTask();
    }

    @Override
    public void executeTask() {
        System.out.println("You should buy " + quantity + " pieces of " + whatToBuy);
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
