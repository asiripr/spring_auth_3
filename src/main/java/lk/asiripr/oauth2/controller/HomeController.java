package lk.asiripr.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "Hello";
	}

	@GetMapping("/secured")
	public String secured() {
		return "Secured Content";
	}
}
