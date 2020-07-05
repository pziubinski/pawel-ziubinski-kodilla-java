package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateQueueCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public int getQueueCount() {
        return updateQueueCount;
    }

    @Override
    public void update(StudentJobQueue studentJobQueue) {
        updateQueueCount++;
        int queueSize = studentJobQueue.getJobQueue().size();

        System.out.println(mentorName + ": New " + studentJobQueue.getStudentName() + " job is waiting to be checked " +
                "(" + queueSize + " job" + (queueSize == 1 ? "" : "s") + " for this student and total: " +
                getQueueCount() + " job" + (getQueueCount() == 1 ? "" : "s") + " in queue)");
    }
}
