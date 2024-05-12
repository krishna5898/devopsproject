package com.verizon.wallet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ach {
	
	String accountHolderName;
	String accountNumber;
	String ifsc;
	String accountType;

}
