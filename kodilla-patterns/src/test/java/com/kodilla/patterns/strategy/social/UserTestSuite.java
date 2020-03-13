package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User oldMillenials = new Millenials("Old Millenials");
        User boYGeneration = new YGeneration("Boy from Y");
        User girlzZGeneration = new ZGeneration("Girlzzz form Z");

        //When
        String millenialPost = oldMillenials.sharePost();
        System.out.println(oldMillenials.getName() + ": " + millenialPost);

        String boyPost = boYGeneration.sharePost();
        System.out.println(boYGeneration.getName() + ": " + boyPost);

        String girlPost = girlzZGeneration.sharePost();
        System.out.println(girlzZGeneration.getName() + ": " + girlPost);

        //Then
        Assert.assertEquals("Facebook", millenialPost);
        Assert.assertEquals("Twitter", boyPost);
        Assert.assertEquals("Snapchat", girlPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user = new Millenials("Young Millenials");

        //When
        String userPost = user.sharePost();
        System.out.println("First post of user: " + user.getName() + ": " + userPost);
        user.setSocialPublisher(new SnapchatPublisher());
        userPost = user.sharePost();
        System.out.println("Second post of user: " + user.getName() + ", when he discovered new social media platform and he posted on: " + userPost);

        //Then
        Assert.assertEquals("Snapchat", userPost);
    }
}
