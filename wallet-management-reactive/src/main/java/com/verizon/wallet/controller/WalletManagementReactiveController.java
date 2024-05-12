package com.verizon.wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.wallet.dto.Ach;
import com.verizon.wallet.dto.Card;
import com.verizon.wallet.dto.Wallet;
import com.verizon.wallet.service.WalletManagementReactiveService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/wallet-management-reactive")
public class WalletManagementReactiveController {
	
	@Autowired
	private WalletManagementReactiveService walletManagementReactiveService;

	@GetMapping("/fetchAllTheNewCards")
	public Flux<Card> getAllTheNewCard()
	{
		return walletManagementReactiveService.getAllTheNewCards();
	}
	
	@GetMapping("/fetchAllTheNewAchs")
	public Flux<Ach> getAllTheNewAch()
	{
		return walletManagementReactiveService.getAllTheNewAchs();
	}
	
	@GetMapping("/fetchAllTheNewWallets")
	public Flux<Wallet> getAllTheNewWallets()
	{
		return walletManagementReactiveService.getAllTheWallets();
	}
	
}
