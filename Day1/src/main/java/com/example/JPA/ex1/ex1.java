package com.example.JPA.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class ex1 {
	
	public String name="Abinaya";
    @GetMapping("/helo")
public String disp() {
	return "hello "+name;
}
	
}
