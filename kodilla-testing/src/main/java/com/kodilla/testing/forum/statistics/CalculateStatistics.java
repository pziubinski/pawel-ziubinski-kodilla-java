package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {
    Statistics statistics;
    private double postPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        try {
            postPerUser = statistics.postsCount()/statistics.usersNames().size();
            if (statistics.usersNames().size() == 0)
                throw new ArithmeticException();

        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occured!");
        }

        try {
            commentsPerUser = statistics.commentsCount()/statistics.usersNames().size();
            if (statistics.usersNames().size() == 0)
                throw new ArithmeticException();

        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occured!");
        }

        try {
            commentsPerPost = statistics.commentsCount()/statistics.postsCount();
            if (statistics.postsCount() == 0)
                throw new ArithmeticException();

        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occured!");
        }
    }

    public void showStatistics() {
        System.out.println("Advanced forum statistics: ");
        System.out.println("User's counter: " + statistics.usersNames().size());
        System.out.println("Post's counter: " + statistics.postsCount());
        System.out.println("Comment's counter: " + statistics.commentsCount());
        System.out.println("Average posts per user: " + postPerUser);
        System.out.println("Average comments per user: " + commentsPerUser);
        System.out.println("Average comments per post: " + commentsPerPost);
    }
}