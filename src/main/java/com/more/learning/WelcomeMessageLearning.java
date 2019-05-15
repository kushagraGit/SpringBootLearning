package com.more.learning;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessageLearning{
	public String getMesg() {
		return "This is your welcome message, updated from different package!";
	}
}