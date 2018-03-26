package com.bbva.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWord {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		//Prueba para el commit
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello all the genius tu!!, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message );
		
	}
}
