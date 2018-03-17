package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("Test OK");
        }
        else {
            System.out.println("Error !");
        }
        System.out.println();
        System.out.println("Test calculator");

        Calculator calculator = new Calculator();
        int sumResult = calculator.sum(3, 2);
        System.out.println("Wynik dodawania " + sumResult);
        int substractResult = calculator.substract(6, 2);
        System.out.println("Wynik odejmowania " + substractResult);

    }
}
