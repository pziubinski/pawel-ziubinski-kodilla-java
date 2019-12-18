package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("jeden", (a) -> "** " + a + " **");
        poemBeautifier.beautify("dwa", (a) -> a.toUpperCase());

        poemBeautifier.beautify("trzy", (a) -> {
            String temp = "\n";
            for (int i = 0; i < a.length() + 6; i++) {
                temp += "*";
            }
            temp += "\n** " + a + " **\n";
            for (int i = 0; i < a.length() + 6; i++) {
                temp += "*";
            }
            return temp;
        });

        poemBeautifier.beautify("CzterY", (a) -> {
            String result = "";
            //result = a.substring(a.length()-1 , a.length());

            for (int i = 0; i < a.length(); i++) {
                result += a.substring(a.length() - i - 1, a.length() - i);
            }
            return result;
        });

        poemBeautifier.beautify("Pięć", (a) -> a + " " + a);

        System.out.println("\nUsing Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}