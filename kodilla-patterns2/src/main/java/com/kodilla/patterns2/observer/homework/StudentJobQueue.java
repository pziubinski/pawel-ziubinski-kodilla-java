package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentJobQueue implements Observable {
    private final List<Observer> observers;
    private final List<String> jobQueue;
    private final String studentName;

    public StudentJobQueue(String studentName) {
        observers = new ArrayList<>();
        jobQueue = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addJob(String job) {
        jobQueue.add(job);
        notifyObservers();
    }

    public List<String> getJobQueue() {
        return jobQueue;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
