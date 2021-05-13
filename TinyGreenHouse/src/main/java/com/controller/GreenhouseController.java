//package com.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.divo.domain.Greenhouse;
//import com.service.GHService;
//
//@Controller
//public class GreenhouseController {
//
//	@Autowired
//	private GHService greenhouseService;
//	
////	@Autowired(required = true)
////	@Qualifier(value = "gHService")
////	public void setGreenhouseService(GHService ghs) {
////		
////		this.greenhouseService = ghs;
////	}
//	
//	@RequestMapping(value = "/greenhouses", method = RequestMethod.GET)
//	@ResponseBody
//	public String listGreenhouses(Model model) {
//		if(model == null)
//			System.out.println("model is big fat NULLLLLL nowwwwwwwwwww");
//		model.addAttribute("greenhouse", new Greenhouse());
//		if(greenhouseService == null)
//			System.out.println("greenhouseservice is big fat NULLLLLLLLLLLLLLLLLL ");
//		model.addAttribute("listGreenhouses", this.greenhouseService.listGreenhouses());
//		
//		return "greenhouses";
//	}
//	
//	@RequestMapping(value = "/greenhouse/add", method = RequestMethod.POST)
//	public String addGreenhouse(@ModelAttribute("greenhouse") Greenhouse gh) {
//		
//		if(gh.getId() == 0) {
//			this.greenhouseService.addGreenhouse(gh);
//		} else {
//			this.greenhouseService.updateGreenhouse(gh);
//		}
//		
//		return "redirect:/greenhouses";
//	}
//	
//	@RequestMapping("/remove/{id}")
//	public String removeGreenhouse(@PathVariable("id") int id) {
//		
//		this.greenhouseService.removeGreenhouse(id);
//		return "redirect:/greenhouses";
//	}
//	
//	@RequestMapping("/edit/{id}")
//	public String editGreenhouse(@PathVariable("id") int id, Model model) {
//		
//		model.addAttribute("greenhouse", this.greenhouseService.getGreenhouseById(id));
//		model.addAttribute("listGreenhouses", this.greenhouseService.listGreenhouses());
//		
//		return "greenhouse";
//	}
//}
