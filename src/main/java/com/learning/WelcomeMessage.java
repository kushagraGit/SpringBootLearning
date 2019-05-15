package com.learning;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage{
	public String getMesg() {
		return "This is your welcome message, updated!";
	}
}