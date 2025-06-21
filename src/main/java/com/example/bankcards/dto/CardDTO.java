package com.example.bankcards.dto;

import com.example.bankcards.entity.Card;
import com.example.bankcards.entity.CardStatus;
import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CardDTO {
    private Long id;
    private String maskedCartNumber;
    private String cartHolder;
    private LocalDate validityPeriod;
    private CardStatus status;
    private Double balance;

    public CardDTO(Card card) {
        this.id = card.getId();
        this.maskedCartNumber = maskCardNumber(card.getCartNumber());
    }

    private String maskCardNumber(String cartNumber) {
        if (cartNumber == null || cartNumber.length() != 16) {
            throw new IllegalStateException("Card number must be 16 digits");
        }
        return "**** **** **** " + cartNumber.substring(12);
    }


}
