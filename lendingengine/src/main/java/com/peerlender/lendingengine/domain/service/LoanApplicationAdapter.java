package com.peerlender.lendingengine.domain.service;

import java.time.Duration;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.peerlender.lendingengine.application.model.LoanRequest;
import com.peerlender.lendingengine.domain.exception.UserNotFoundException;
import com.peerlender.lendingengine.domain.model.LoanApplication;
import com.peerlender.lendingengine.domain.model.User;
import com.peerlender.lendingengine.domain.repository.UserRepository;


@Component
public class LoanApplicationAdapter {
	
	private final UserRepository userRepository;
	
	@Autowired
	public LoanApplicationAdapter(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public LoanApplication transform(LoanRequest req, User borrower)
	{
		Optional<User> userOptional = userRepository.findById(borrower.getUsername());
		
		if(userOptional.isPresent())
		{
			System.out.println("ji"+Duration.ofDays(req.getDaysToRepay())+"as"+req.toString());
			return new LoanApplication(req.getAmount(),userOptional.get(),req.getDaysToRepay(),req.getInterestRate());
		}
		else {
			throw new UserNotFoundException(borrower.getUsername());
			
		}
		
	}

}
