package com.peerlending.securityapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.peerlending.securityapp.user.model.User;
import com.peerlending.securityapp.user.model.repository.UserRepository;

@SpringBootApplication
public class SecurityappApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SecurityappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userRepository.save(new User("John","12345"));
		userRepository.save(new User("Joe","12345"));
		userRepository.save(new User("Jay","12345"));
	}

}
