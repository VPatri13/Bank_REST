package com.example.bankcards.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class TransferRequestDTO {
    @NotNull(message = "Source card ID cannot be null")
    private Long sourceCardId;

    @NotNull(message = "Target card ID cannot be null")
    private Long targetCardId;

    @Positive(message = "Amount must be positive")
    private Double amount;
}
