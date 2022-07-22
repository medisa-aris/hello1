package id.co.globaledu.devopstr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
	
	@GetMapping("/id/{name}")
	private String getHello(@PathVariable String name) {
		return "Hello " + name;
	}
	
	@GetMapping("/")
	private String getHomepage() {
		return "Just Homepage";
	}
}
