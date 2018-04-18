package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]){
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
           String result = secondChallenge.probablyIWillThrowException(2, 13);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error, try again");
        } finally {
            System.out.println("'x' must be =< 2 and >1, 'y' can`t be 1.5");
        }
    }
}
