package com.kodilla.patterns2.observer.forum;

public class ForumUser implements Observer {
    private final String userName;
    private int updateCount;

    public ForumUser(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(userName + ": New message in topic " + forumTopic.getName() + "\n" +
                            " (total: " + forumTopic.getMessage().size() + " messages)");
        updateCount++;
    }
}
