package com.divo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.divo.repositories.GreenhouseRepository;

@Controller
public class GreenhouseController {

	private GreenhouseRepository greenhouseRepository;
	
	public GreenhouseController(GreenhouseRepository greenhouseRepository) {
		this.greenhouseRepository = greenhouseRepository;
	}
	
	@RequestMapping("/greenhouses")
	public String getGreenhouses(Model model) {
		model.addAttribute("greenhouses", greenhouseRepository.findAll());
		
		return "greenhouses/list";
	}
}
