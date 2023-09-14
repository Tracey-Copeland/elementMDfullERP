package com.tracey.elementmdfullerp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tracey.elementmdfullerp.models.ProductMaterial;
import com.tracey.elementmdfullerp.services.ProductMaterialService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/productmaterials")
public class ProductMaterialController {

	private final ProductMaterialService productmaterialServ;
	public ProductMaterialController(ProductMaterialService productmaterialServ) {
		this.productmaterialServ = productmaterialServ;
	}
	
	@GetMapping("/create")
	public String createProductMaterial(@ModelAttribute("productmaterial")ProductMaterial productmaterial) {
		return "productmaterial/create.jsp";
	}
	
	@PostMapping("/process/create")
	public String processProductCreateMaterial(@Valid @ModelAttribute("productmaterial")ProductMaterial productmaterial, BindingResult result) {
		if(result.hasErrors()) {
			return "productmaterial/create.jsp";
		}
		productmaterialServ.create(productmaterial);
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String showAllProductMaterials(Model model) {
		model.addAttribute("allProductMaterials", productmaterialServ.getAll());
		return "productmaterial/showAll.jsp";
	}

}
