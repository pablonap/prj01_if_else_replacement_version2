package com.example;

public class ValueSeven implements Operation {
    final double CART_VALUE = 7.0;
    @Override
    public double apply() {
        return CART_VALUE * 2.5;
    }
}
