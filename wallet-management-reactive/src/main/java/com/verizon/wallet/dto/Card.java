package com.verizon.wallet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
	
	String cardNumber;
	String cardHolderName;
	String expiryMonth;
	String expiryYear;
	String cvv;
	String cardType;

}
