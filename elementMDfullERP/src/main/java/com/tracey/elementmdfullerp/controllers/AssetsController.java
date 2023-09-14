package com.tracey.elementmdfullerp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tracey.elementmdfullerp.models.Assets;
import com.tracey.elementmdfullerp.models.SalesOrder;
import com.tracey.elementmdfullerp.services.AssetsService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/assets")
public class AssetsController {

	private final AssetsService assetsServ;
	public AssetsController(AssetsService assetsServ) {
		this.assetsServ = assetsServ;
	}
	
	@GetMapping("/create")
	public String createAssets(@ModelAttribute("assets")Assets assets) {
		return "assets/create.jsp";
	}
	
	@PostMapping("/process/create")
	public String processCreateAssets(@Valid @ModelAttribute("assets")Assets assets, BindingResult result) {
		if(result.hasErrors()) {
			return "assets/create.jsp";
		}
		assetsServ.create(assets);
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String showAllAssets(Model model) {
		model.addAttribute("allAssets", assetsServ.getAll());
		return "assets/showAll.jsp";
	}
	
	@GetMapping("/{id}")
	public String showOneAssets(@PathVariable("id") Long id, Model model) {
		model.addAttribute("assets", assetsServ.getOne(id));
		return "assets/showOne.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editAssets(@PathVariable("id") Long id, Model model,HttpSession session ) {
		
		model.addAttribute("assets", assetsServ.getOne(id));
		return "assets/edit.jsp";
	}
	
	@PutMapping("/process/edit/{id}")
	public String processEditAssets(@Valid @ModelAttribute("assets") Assets assets, BindingResult result) {
		if(result.hasErrors()) {
			return "assets/edit.jsp";
		}
		assetsServ.update(assets);
		return "redirect:/";
	}
	
	

}
