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

    public void setPostPerUser(double postPerUser) {
        this.postPerUser = postPerUser;
    }

    public void setCommentsPerUser(double commentsPerUser) {
        this.commentsPerUser = commentsPerUser;
    }

    public void setCommentsPerPost(double commentsPerPost) {
        this.commentsPerPost = commentsPerPost;
    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        try {
            setPostPerUser((double)statistics.postsCount()/(double)statistics.usersNames().size());
            if (statistics.usersNames().size() == 0)
                throw new ArithmeticException();

        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occured!");
        }

        try {
            setCommentsPerUser((double)statistics.commentsCount()/(double)statistics.usersNames().size());
            if (statistics.usersNames().size() == 0)
                throw new ArithmeticException();

        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occured!");
        }

        try {
            setCommentsPerPost((double)statistics.commentsCount()/(double)statistics.postsCount());
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
        System.out.println("Average posts per user: " + getPostPerUser());
        System.out.println("Average comments per user: " + getCommentsPerUser());
        System.out.println("Average comments per post: " + getCommentsPerPost());
    }
}