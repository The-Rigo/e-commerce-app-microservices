package org.rigodev.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductRequest(
        Integer id,
        @NotNull(message = "Product name is requierd")
        String name,
        @NotNull(message = "Product description is requierd")
        String description,
        @Positive(message = "Available quantity should be positive")
        Double availableQuantity,
        @Positive(message = "Price should be positive")
        BigDecimal price,
        @NotNull(message = "Price category is required")
        Integer categoryId
) {
}
