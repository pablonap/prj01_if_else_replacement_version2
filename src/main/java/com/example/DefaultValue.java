package com.example;

public class DefaultValue implements Operation {
    final double DEFAULT_VALUE = 1.5;
    @Override
    public double apply() {
        return DEFAULT_VALUE;
    }
}
