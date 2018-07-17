package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }
    @Override
    public void update(Homework homework) {
        System.out.println(username + " has new homework from " + homework.getName() + "\n" +
                " (total: " + homework.getTasks().size() + " messages)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
