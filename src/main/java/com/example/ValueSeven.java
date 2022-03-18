package com.example;

public class ValueSeven implements Operation {
    @Override
    public double apply() {
        return OperationType.VALUE_SEVEN.getValue() * 2.5;
    }
}
