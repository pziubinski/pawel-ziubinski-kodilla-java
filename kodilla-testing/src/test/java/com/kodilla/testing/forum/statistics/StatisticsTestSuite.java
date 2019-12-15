package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    @Test
    public void testWhenZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<>();
        statisticsList.add("Michał");
        statisticsList.add("Paweł");
        when(statisticsMock.usersNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(0);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int postsCnt = calculateStatistics.statistics.postsCount();
        calculateStatistics.showStatistics();

        //Then
        Assert.assertEquals(0, postsCnt);
    }

    @Test
    public void testWhenThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<>();
        statisticsList.add("Michał");
        statisticsList.add("Paweł");
        when(statisticsMock.usersNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(1000);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int postsCnt = calculateStatistics.statistics.postsCount();
        calculateStatistics.showStatistics();

        //Then
        Assert.assertEquals(1000, postsCnt);
    }

    @Test
    public void testWhenZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<>();
        statisticsList.add("Michał");
        statisticsList.add("Paweł");
        when(statisticsMock.usersNames()).thenReturn(statisticsList);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int commentsCount = calculateStatistics.statistics.commentsCount();
        calculateStatistics.showStatistics();

        //Then
        Assert.assertEquals(0, commentsCount);
    }

    @Test
    public void testWhenCommentsLessThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<>();
        statisticsList.add("Michał");
        statisticsList.add("Paweł");
        when(statisticsMock.usersNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(300);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int postsCount = calculateStatistics.statistics.postsCount();
        int commentsCount = calculateStatistics.statistics.commentsCount();
        calculateStatistics.showStatistics();

        //Then
        Assert.assertTrue(postsCount > commentsCount);
    }

    @Test
    public void testWhenCommentsMoreThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<>();
        statisticsList.add("Michał");
        statisticsList.add("Paweł");
        when(statisticsMock.usersNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(300);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int postsCount = calculateStatistics.statistics.postsCount();
        int commentsCount = calculateStatistics.statistics.commentsCount();
        calculateStatistics.showStatistics();

        //Then
        Assert.assertTrue(postsCount < commentsCount);
    }

    @Test
    public void testWhenZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(230);
        when(statisticsMock.commentsCount()).thenReturn(20);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int usersCnt = calculateStatistics.statistics.usersNames().size();
        calculateStatistics.showStatistics();

        //Then
        Assert.assertEquals(0, usersCnt);
    }

    @Test
    public void testWhenHundedUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> statisticsList = new ArrayList<>();

        for (Integer i = 0; i < 100; i++)
            statisticsList.add(Integer.toString(i));

        when(statisticsMock.usersNames()).thenReturn(statisticsList);
        when(statisticsMock.postsCount()).thenReturn(230);
        when(statisticsMock.commentsCount()).thenReturn(20);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int usersCnt = calculateStatistics.statistics.usersNames().size();
        calculateStatistics.showStatistics();

        //Then
        Assert.assertEquals(100, usersCnt);
    }
}