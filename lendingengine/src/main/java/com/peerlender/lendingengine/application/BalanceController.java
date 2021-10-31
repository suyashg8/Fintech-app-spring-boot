package com.peerlender.lendingengine.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peerlender.lendingengine.domain.model.Money;
import com.peerlender.lendingengine.domain.service.BalanceService;

@RestController
@RequestMapping("/balance")
public class BalanceController {

	
	private final BalanceService balanceService;

	@Autowired
	public BalanceController(BalanceService balanceService) {
		super();
		this.balanceService = balanceService;
	}
	
	@PostMapping("/topup")
	public void topUp(final @RequestBody Money money, @RequestHeader String authorization ) {
		balanceService.topUpBalance(money, authorization);
	}
	
	@PostMapping("/withdraw")
	public void withdraw(final @RequestBody Money money, @RequestHeader String authorization ) {
		balanceService.withdrawFromBalance(money, authorization);
	}
	
}
