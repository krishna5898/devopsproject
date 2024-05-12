package com.verizon.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.wallet.dao.WalletManagementReactiveDao;
import com.verizon.wallet.dto.Ach;
import com.verizon.wallet.dto.Card;
import com.verizon.wallet.dto.Wallet;

import reactor.core.publisher.Flux;

@Service
public class WalletManagementReactiveService {
	
	@Autowired
	private WalletManagementReactiveDao dao;
	
	
	
	public Flux<Card> getAllTheNewCards()
	{
		return  dao.getCards();
	}
	
	public Flux<Ach> getAllTheNewAchs()
	{
		return dao.getAchs();
	} 
	
	public Flux<Wallet> getAllTheWallets()
	{
		return dao.getWallets();
	} 

}
