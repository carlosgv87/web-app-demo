package com.bbva.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWord {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "<br><div style='text-align:center;'><h3>HOLA SANDRA</h3></div><br>";
		return new ModelAndView("welcome", "message", message );
	}
}
