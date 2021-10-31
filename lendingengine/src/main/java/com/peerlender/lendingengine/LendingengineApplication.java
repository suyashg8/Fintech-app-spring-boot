package com.peerlender.lendingengine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.peerlender.lendingengine.domain.model.Balance;
import com.peerlender.lendingengine.domain.model.Currency;
import com.peerlender.lendingengine.domain.model.Money;
import com.peerlender.lendingengine.domain.model.User;

import com.peerlender.lendingengine.domain.repository.UserRepository;

@SpringBootApplication
public class LendingengineApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(LendingengineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User John= new User("John","John","B",27,"Software Developer",new Balance());
		User Peter = new User("Joe","Joe","B",30,"Software Tester",new Balance());
		John.topUp(new Money(100,Currency.USD));
		Peter.topUp(new Money(100,Currency.USD));
		userRepository.save(John);
		userRepository.save(Peter);
		userRepository.save(new User("Jay","Jay","Y",35,"Tester",new Balance()) );
	}

}
