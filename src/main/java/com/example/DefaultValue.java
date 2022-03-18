package com.example;

public class DefaultValue implements Operation {
    @Override
    public double apply() {
        return OperationType.DEFAULT_VALUE.getValue();
    }
}
