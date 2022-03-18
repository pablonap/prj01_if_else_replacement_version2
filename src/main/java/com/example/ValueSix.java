package com.example;

public class ValueSix implements Operation {
    @Override
    public double apply() {
        return OperationType.VALUE_SIX.getValue() * 1.5;
    }
}
