package com.company;

public class Calculator {
    public static float Calculate (float x, float y, String op){
        switch (op) {
            case "+":
                return new CalculationResult(x + y, true, "");
            case "-":
                return new CalculationResult(x - y, true, "");
            case "*":
                return new CalculationResult(x * y, true, "");
            case "/":
                if(y == 0f) {
                    return new CalculationResult(0f, false, "Division by zero is not allowed");
                }
                return new CalculationResult(x / y, true, "");
            default:
                return new CalculationResult(0f, false, "Such operation not found");
        }

    }
}
