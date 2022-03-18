package com.example;

public enum OperationType {
    VALUE_SIX(6.0), VALUE_SEVEN(7.0), DEFAULT_VALUE(1.5);

    private final Double value;

    private OperationType(final Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
