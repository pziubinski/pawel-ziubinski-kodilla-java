package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser","Kowalski");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        if(calculator.add(2, 5) == 7) {
            System.out.println("test dodawania OK");
        } else {
            System.out.println("Błąd dodawania!");
        }

        if(calculator.subtract(2, 5) == -3) {
            System.out.println("test odejmowania OK");
        } else {
            System.out.println("Błąd odejmowania!");
        }



    }
}