package com.tracey.elementmdfullerp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tracey.elementmdfullerp.models.SingleProductionOrderMaterial;
import com.tracey.elementmdfullerp.services.SingleProductionOrderMaterialService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/singprodordermat")
public class SingleProductionOrderMaterialController {

	private final SingleProductionOrderMaterialService singleproductionordermaterialServ;
	
	public SingleProductionOrderMaterialController(SingleProductionOrderMaterialService singleproductionordermaterialServ) {
		this.singleproductionordermaterialServ = singleproductionordermaterialServ;
	}
	
	@GetMapping("/create")
	public String createSingleProductionOrderMaterial(@ModelAttribute("singleproductionordermaterial")SingleProductionOrderMaterial singleproductionordermaterial) {
		return "siProdOrderMat/create.jsp";
	}
	
	@PostMapping("/process/create")
	public String processSingleProductionOrderMaterial(@Valid @ModelAttribute("singleproductionordermaterial")SingleProductionOrderMaterial singleproductionordermaterial, BindingResult result) {
		if(result.hasErrors()) {
			return "siProdOrderMat/create.jsp";
		}
		singleproductionordermaterialServ.create(singleproductionordermaterial);
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String showAllSingleProductionOrderMaterial(Model model) {
		model.addAttribute("allSingleProductionOrderMaterials", singleproductionordermaterialServ.getAll());
		return "siProdOrderMat/showAll.jsp";
	}

}
