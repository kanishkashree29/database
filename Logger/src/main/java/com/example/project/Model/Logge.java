package com.example.project.Model;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Logge {
	Logger l=LoggerFactory.getLogger(Controller.class);
     @RequestMapping("/log")
	public String demo() {
		l.info("information message");
		l.warn("warning message");
		l.error("Error Message");
		l.debug("debugging message");
		l.trace("Trace message");
		return "Completed";
	}

}
