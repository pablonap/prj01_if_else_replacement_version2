package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperationFactory {
    static Map<Double, Operation> operationMap = new HashMap<>();

    static {
        operationMap.put(6.0, new ValueSix());
        operationMap.put(7.0, new ValueSeven());
    }

    public static Optional<Operation> getOperation(Cart cart) {
        return Optional.ofNullable(operationMap.get(cart.value()));
    }
}
