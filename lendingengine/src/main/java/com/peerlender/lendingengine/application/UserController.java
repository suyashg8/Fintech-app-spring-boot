package com.peerlender.lendingengine.application;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peerlender.lendingengine.domain.model.User;
import com.peerlender.lendingengine.domain.model.service.TokenValidationService;
import com.peerlender.lendingengine.domain.repository.UserRepository;

@RestController
public class UserController {

	private final UserRepository userRepository; 
	private final TokenValidationService tokenValidationService;
	
	@Autowired
	public UserController(UserRepository userRepository, TokenValidationService tokenValidationService) {
		super();
		this.userRepository = userRepository;
		this.tokenValidationService = tokenValidationService;
	}

	@GetMapping(value="/users")
	public List<User> findUsers(HttpServletRequest request) {
		tokenValidationService.validateTokenAndGetUser(request.getHeader(HttpHeaders.AUTHORIZATION));
		return userRepository.findAll();
	}
}
