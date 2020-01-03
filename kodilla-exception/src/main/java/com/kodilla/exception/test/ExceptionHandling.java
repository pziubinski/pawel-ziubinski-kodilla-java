package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public static void main(String[] args)  {

        SecondChallenge secondChallenge = new SecondChallenge();


        try {

            String str = secondChallenge.probablyIWillThrowException(1.5, 1.5);
            System.out.println(str);

        } catch (ExceptionHandling e) {

            System.out.println("Problem with Second Challange!");
            e.printStackTrace();

        }
    }
}
