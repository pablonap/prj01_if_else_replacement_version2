package com.example;

import java.util.Map;
import java.util.Optional;

public class OperationFactory {
    private final static Map<Double, Operation> operationMap = Map.of(
            OperationType.VALUE_SIX.getValue(), new ValueSix(),
            OperationType.VALUE_SEVEN.getValue(), new ValueSeven());

    public static Optional<Operation> getOperation(Cart cart) {
        return Optional.ofNullable(operationMap.get(cart.value()));
    }
}
