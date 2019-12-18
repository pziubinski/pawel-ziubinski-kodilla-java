package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String str, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(str);
        System.out.println("Result: " + result);
    }
}
