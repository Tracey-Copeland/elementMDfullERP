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

import com.tracey.elementmdfullerp.models.Material;
import com.tracey.elementmdfullerp.services.MaterialService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/materials")
public class MaterialController {

	private final MaterialService materialServ;
	public MaterialController(MaterialService materialServ) {
		this.materialServ = materialServ;
	}
	
	@GetMapping("/create")
	public String createMaterial(@ModelAttribute("material")Material material) {
		return "material/create.jsp";
	}
	
	@PostMapping("/process/create")
	public String processCreateMaterial(@Valid @ModelAttribute("material")Material material, BindingResult result) {
		if(result.hasErrors()) {
			return "material/create.jsp";
		}
		materialServ.create(material);
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String showAllMaterials(Model model) {
		model.addAttribute("allMaterials", materialServ.getAll());
		return "material/showAll.jsp";
	} 
	
	@GetMapping("/inventory")
	public String showInventoryMaterials(Model model) {
		model.addAttribute("allMaterials", materialServ.getAll());
		return "material/inventory.jsp";
	}
	
	@GetMapping("/{id}")
	public String showOneMaterial(@PathVariable("id") Long id, Model model) {
		model.addAttribute("material", materialServ.getOne(id));
		return "material/showOne.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editMaterial(@PathVariable("id") Long id, Model model,HttpSession session ) {
		model.addAttribute("material", materialServ.getOne(id));
		return "material/edit.jsp";
	}
	
	@PutMapping("/process/edit/{id}")
	public String processEditMaterial(@Valid @ModelAttribute("material") Material material, BindingResult result) {
		if(result.hasErrors()) {
			return "material/edit.jsp";
		}
		materialServ.update(material);
		return "redirect:/";
	}

}
