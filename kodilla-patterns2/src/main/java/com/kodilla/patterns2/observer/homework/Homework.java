package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework {
    private final List<String> tasks;
    private final String studentName;

    public Homework(String studentName) {
        tasks = new ArrayList<>();
        this.studentName = studentName;
    }
    public void addTask(String task) {
        tasks.add(task);
    }
}
