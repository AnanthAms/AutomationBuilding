package com.example.automation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationController {

	@GetMapping(value="/getauto")
	public String getWord() {
		return "Welcome Ananth";
	}
}
