package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy car", "Mercedes", 2.0);
            case PAINTING:
                return new PaintingTask("Paint car element", "Black", "Car Hood");
            case DRIVING:
                return new DrivingTask("Drive vehicle", "Sopot", "Mercedes");
            default:
                return null;
        }
    }
}
