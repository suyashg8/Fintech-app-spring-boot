package com.peerlending.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.peerlending.profile.domain.model.User;
import com.peerlending.profile.domain.repository.UserRepository;
import java.time.LocalDate;

@SpringBootApplication
public class ProfileApplication implements CommandLineRunner {

	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userRepository.save(new User("John","John","B",27,"Software Developer",LocalDate.now()));
	}

}
