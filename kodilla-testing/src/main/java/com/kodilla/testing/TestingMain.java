package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Test calculator");

        Calculator calculator = new Calculator();
        int sumResult = calculator.sum(3, 2);
        if (sumResult == 5) {
            System.out.println("Test dodawania OK");
        }
        else {
            System.out.println("Test dodawania błędny !");
        }

        int substractResult = calculator.substract(5, 2);
        if (substractResult == 3){
            System.out.println("Test odejmowania OK");
        }
        else {
            System.out.println("Test odejmowanie błędny !");
        }
    }
}

