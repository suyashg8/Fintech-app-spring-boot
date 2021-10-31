package com.peerlender.lendingengine.domain.event;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.peerlender.lendingengine.domain.model.User;
import com.peerlender.lendingengine.domain.repository.UserRepository;

@Component
public class UserRegisteredEventHandler {


	private Logger LOGGER= LoggerFactory.getLogger(UserRegisteredEventHandler.class);
	private final UserRepository userRepository;
	private static final Gson GSON= new Gson();
	
	@Autowired
	public UserRegisteredEventHandler(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public void handleUserRegistration(String userDetails) {
		User user = GSON.fromJson(userDetails, User.class);
		LOGGER.info("user {} registered", user.getUsername());
		userRepository.save(user);
	}
}
