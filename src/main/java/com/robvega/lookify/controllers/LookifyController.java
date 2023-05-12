package com.robvega.lookify.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.robvega.lookify.models.Lookify;
import com.robvega.lookify.services.LookifyService;

import jakarta.validation.Valid;

@Controller

public class LookifyController {
	
	private final LookifyService lookifyService;
	public LookifyController(LookifyService lookifyService) {
		this.lookifyService = lookifyService;
	}
	
	@GetMapping("/")
	public String root() {
		return "index.jsp";
	}

//	@GetMapping("/songs")
//	public String index() {
//		return "index.jsp";
//	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Lookify> list = lookifyService.findAll();
		model.addAttribute("list", list);
		return "dashboard.jsp";
	}
	
	@GetMapping("/songs/new")
	public String formSong(@ModelAttribute("cancion") Lookify song) {
		return "formsong.jsp";
	}
	
	@PostMapping("/songs/new")
	public String nuevaSong(@Valid @ModelAttribute("cancion") Lookify song, BindingResult resultado) {
		if(resultado.hasErrors()) {
				return "formsong.jsp";
		}else {
			lookifyService.nuevaSong(song);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/songs/topten")
	public String topTen(Model viewModel) {
		viewModel.addAttribute("topten", lookifyService.cancionesTopDiez() );
		return "topten.jsp";
	}
	
	
}
