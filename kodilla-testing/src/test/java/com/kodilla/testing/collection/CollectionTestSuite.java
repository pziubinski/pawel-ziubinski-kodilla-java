package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Collection test case: begin");
    }

    @After
    public void after() {
        System.out.println("Collection test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> testList = new ArrayList<>();

        //When
        OddNumbersExterminator odd = new OddNumbersExterminator();

        //Then
        Assert.assertTrue(odd.getOddNumbers().isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> testList = new ArrayList<>();

        //When
        testList.add(0);
        testList.add(2);
        testList.add(4);
        testList.add(6);
        testList.add(8);

        for(int i = 0; i < 10; i++) {
            oddList.add(i);
        }

        OddNumbersExterminator odd = new OddNumbersExterminator();
        odd.exterminate(oddList);

        //Then
        Assert.assertEquals(testList, odd.getOddNumbers());
    }
}