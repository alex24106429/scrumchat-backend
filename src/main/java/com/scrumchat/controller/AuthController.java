package com.scrumchat.controller;

import com.scrumchat.model.User;
import com.scrumchat.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	private final UserService userService;

	public AuthController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody RegistrationRequest request) {
		User user = userService.registerUser(request.username(), request.password());
		return ResponseEntity.ok(user);
	}

	public record RegistrationRequest(String username, String password) {}
}