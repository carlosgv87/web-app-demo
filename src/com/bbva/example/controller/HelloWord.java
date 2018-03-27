package com.bbva.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWord {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "<div style='text-align:center;'><br><h3>EJEMPLO DE INTEGRACIÓN CONTINUA</h3><br></div>";
		return new ModelAndView("welcome", "message", message );
	}
}
