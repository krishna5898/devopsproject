package com.verizon.wallet.dao;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

import com.verizon.wallet.dto.Ach;
import com.verizon.wallet.dto.Card;
import com.verizon.wallet.dto.Wallet;

import reactor.core.publisher.Flux;

@Component
public class WalletManagementReactiveDao {
	
	
	public Flux<Card> getCards()
	{
		return Flux.range(1,10000).map(i->
			new Card(RandomStringUtils.randomNumeric(10)+i,RandomStringUtils.randomAlphabetic(10),"07","27",RandomStringUtils.randomNumeric(3),"VISA")
		);
	}
	public Flux<Ach> getAchs()
	{
		return Flux.range(1,10000).map(i->
			new Ach(RandomStringUtils.randomAlphabetic(10),RandomStringUtils.randomNumeric(10)+i,"VZW"+RandomStringUtils.randomNumeric(3),"VISA")
		);
	}
	
	public Flux<Wallet> getWallets()
	{
		Flux<Card> creditCards=getCards();
		Flux<Ach> achs=getAchs();
		
		
		return Flux.zip(creditCards,achs).map(ind->{
			return new Wallet(List.of(ind.getT1()),List.of(ind.getT2()));
		});
		
		
	}

}
