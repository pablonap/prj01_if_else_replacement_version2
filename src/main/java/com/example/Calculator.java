package com.example;

public class Calculator {
    public static double calculate(Cart cart) {
        Operation targetOperation = OperationFactory
                .getOperation(cart).orElseGet(() -> {return new DefaultValue();});

        return targetOperation.apply();
    }
}
