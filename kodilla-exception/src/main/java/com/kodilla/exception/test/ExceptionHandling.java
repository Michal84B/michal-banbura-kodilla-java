package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]){
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
           String result = secondChallenge.probablyIWillThrowException(1, 13);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error, 'x' must be =< 2 and >1, 'y' can`t be 1.5");
        } finally {
            System.out.println("See u next time");
        }
    }
}
