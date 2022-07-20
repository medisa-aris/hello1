package id.co.globaledu.devopstr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService{
	
	@GetMapping("/test/{name}")
	private String getHello(@PathVariable String name) {
		return "Ini Test " + name;
	}
}
