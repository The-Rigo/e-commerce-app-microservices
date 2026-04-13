package org.rigodev.ecommerce.product;

import java.math.BigDecimal;

public record PurchaseResponse(
        Integer id,
        String name,
        String description,
        BigDecimal price,
        Double quantity
) {
}
