package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String x,PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(x);
        System.out.println("Some text " + result);
    }
}
