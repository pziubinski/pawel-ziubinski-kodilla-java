package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final Task executeTask(final TaskEnumeration taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping List", "Pasta", 100);
            case PAINTING:
                return new PaintingTask("Painting List", "Paint", 3);
            case DRIVING:
                return new DrivingTask("Driving List", "Petrol", 45);
            default:
                return null;
        }
    }
}
