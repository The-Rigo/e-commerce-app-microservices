package org.rigodev.ecommerce.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerReponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {
}
