package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error !");
        }
        System.out.println();
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
        if (substractResult == 4){
            System.out.println("Test odejmowania OK");
        }
        else {
            System.out.println("Test odejmowanie błędny !");
        }
    }
}

