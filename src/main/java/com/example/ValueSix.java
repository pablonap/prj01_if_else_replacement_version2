package com.example;

public class ValueSix implements Operation {
    final double CART_VALUE = 6.0;
    @Override
    public double apply() {
        return CART_VALUE * 1.5;
    }
}
