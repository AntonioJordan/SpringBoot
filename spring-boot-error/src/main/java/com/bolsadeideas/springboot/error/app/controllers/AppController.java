package com.bolsadeideas.springboot.error.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SuppressWarnings("unused")
@Controller
public class AppController {
	@GetMapping({"/index", "/"})
	public String index() {
		Integer valor= 100/0;
		return "index";
	}
}
