package com.learning;
import com.more.learning.WelcomeMessageLearning;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@ComponentScan("com.more.learning")
public class FirstController {
	
	//private WelcomeMessage wc = new WelcomeMessage();
	@Autowired
	public WelcomeMessage wc;
	
	@Autowired
	public WelcomeMessageLearning wcm;

	@RequestMapping("/firstController")
	public String str() {
		String fun = wc.getMesg() + "/n" + wcm.getMesg();
		return fun;
		//return "Congrats on your first spring boot application";
	}
}