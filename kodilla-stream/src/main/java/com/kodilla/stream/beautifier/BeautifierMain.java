package com.kodilla.stream.beautifier;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class BeautifierMain {
    public static void main(String[] args){
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Some text to beautify ", x -> "ABC " + x + "ABC");
        poemBeautifier.beautify("New text", x -> "***" + x + "***");
        poemBeautifier.beautify("New Text 2", x -> "^^^" + x + "^^^");
        poemBeautifier.beautify("New Text 3", x -> toUpperCase(x));
    }
}
