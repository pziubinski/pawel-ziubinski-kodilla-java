package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> oddNumbers = new ArrayList<>();

    public ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        for(Integer num : numbers) {
            if(num%2 == 0)
                oddNumbers.add(num);
        }
        return oddNumbers;
    }
}