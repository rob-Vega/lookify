package com.robvega.lookify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.robvega.lookify.models.Lookify;
import com.robvega.lookify.services.LookifyService;

@Controller
public class LookifyController {
	private LookifyService lookifyService;

	public LookifyController(LookifyService lookifyService) {
		this.lookifyService = lookifyService;
	}

	@GetMapping("/index")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/index/dashboard")
	public String dashboard(Model model) {
		List<Lookify> list = lookifyService.findAll();
		model.addAttribute("list", list);
		return "dashboard.jsp";
	}
	
}
