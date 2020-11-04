package com.crudEscuela.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	@GetMapping("/alumno")
	public String alumno() {
		return "app/component/alumno";
	}
	
	@GetMapping("/salon")
	public String salon() {
		return "app/component/salon";
	}

}
