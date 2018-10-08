package com.firstprojectspring.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping("www.google.co.in")
 public String putDetails() {

	 return "Hello";
}

	@GetMapping("www.cricbuzz.com")
	public String dispDetails() {
		return "Phani Kumar";
}
	@PostMapping("/login")
	public Userlog loginUser(@RequestBody Userlog login) {
		login.setUsername("Phantom");
		return login;
		
	
}
	@PostMapping("/log")
	public Userlogin loginUser(@RequestBody Userlogin log) {
		log.setSname("phani Kumar");
		log.setSno("02");
		log.setRollno(1167);
		return log;
	}
}