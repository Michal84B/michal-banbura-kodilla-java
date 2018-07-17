package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements HomeworkObservable{
    private final List<HomeworkObserver> homeworkObservers;
    private final List<String> tasks;
    private final String name;

    public Homework(String name) {
        homeworkObservers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }
    public void addTask(String task) {
        tasks.add(task);
        notifyHomeworkObservers();
    }
    @Override
    public void registerHomeworkObserver(HomeworkObserver homeworkObserver) {
        homeworkObservers.add(homeworkObserver);
    }
    @Override
    public void notifyHomeworkObservers() {
        for(HomeworkObserver homeworkObserver : homeworkObservers) {
            homeworkObserver.update(this);
        }
    }
    @Override
    public void removeHomeworkObserver(HomeworkObserver homeworkObserver) {
        homeworkObservers.remove(homeworkObserver);
    }
    public List<String> getTasks() {
        return tasks;
    }
    public String getName() {
        return name;
    }
}
