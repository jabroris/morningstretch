package com.divo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.divo.domain.Greenhouse;
import com.divo.repositories.GreenhouseRepository;

@Controller
public class GreenhouseController {

	private GreenhouseRepository greenhouseRepository;
	
	public GreenhouseController(GreenhouseRepository greenhouseRepository) {
		super();
		this.greenhouseRepository = greenhouseRepository;
	}
	
	@RequestMapping("/greenhouses")
	public String getGreenhouses(Model model) {
		model.addAttribute("greenhouses", greenhouseRepository.findAll());
		
		return "greenhouses/list";
	}
	
	@GetMapping("/addnewgreenhouse") 
	public String addNewGreenhouse(Model model) {
		model.addAttribute("greenhouse", new Greenhouse());
		return "greenhouses/add-greenhouse";
	}
	
	@PostMapping("/addgreenhouse")
	public String addGreenhouse(Greenhouse gh, BindingResult result, Model model) {
		gh = (Greenhouse) model.getAttribute("greenhouse");
		
		if(result.hasErrors()) {
			return "greenhouses/add-greenhouse";
		}
		
		greenhouseRepository.save(gh);
		return "redirect:/greenhouses";
	}
	
	
	
//	@RequestMapping("/addgreenhouse")
//	public String addGreenhouse(Model model) {
//		String name = (String) model.getAttribute("name");
//		double latitude = Double.parseDouble((String)model.getAttribute("latitude"));
//		double longitude = (double) model.getAttribute("longitude");
//		String description = (String) model.getAttribute("description");
//		Greenhouse gh = new Greenhouse(name, latitude, longitude, description);
//		model.addAttribute("addgreenhouse", greenhouseRepository.save(gh));
//		
//		return "greenhouses/list";
//	}
}
