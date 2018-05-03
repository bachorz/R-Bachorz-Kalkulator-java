

package com.kodilla.kalkulator;

import java.util.*;
import java.lang.*;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public static void main(String[] args){

        Random generator = new Random();
        int a;
        a = generator.nextInt(10000);

        int b;
        b = generator.nextInt(10000);

        Calculator calculator = new Calculator();
        int additionResult = calculator.add(a, b);
        int subtractionResult = calculator.subtract(a, b);

        System.out.println("a is number: " + a);
        System.out.println("b is number: " + b);
        System.out.println(additionResult);
        System.out.println(subtractionResult);
    }
}
