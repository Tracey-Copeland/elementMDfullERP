package com.tracey.elementmdfullerp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tracey.elementmdfullerp.models.ProductionOrder;
import com.tracey.elementmdfullerp.models.PurchaseOrder;
import com.tracey.elementmdfullerp.services.ProductionOrderService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/productionorders")
public class ProductionOrderController {

	private final ProductionOrderService productionorderServ;
	public ProductionOrderController(ProductionOrderService productionorderServ) {
		this.productionorderServ = productionorderServ;
	}
	
	@GetMapping("/create")
	public String createProductionOrder(@ModelAttribute("productionorder")ProductionOrder productionorder) {
		return "productionorder/create.jsp";
	}
	
	@PostMapping("/process/create")
	public String processCreateProductionOrder(@Valid @ModelAttribute("productionorder")ProductionOrder productionorder, BindingResult result) {
		if(result.hasErrors()) {
			return "productionorder/create.jsp";
		}
		productionorderServ.create(productionorder);
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String showAllProductionOrder(Model model) {
		model.addAttribute("allProductionOrder", productionorderServ.getAll());
		return "productionorder/showAll.jsp";
	}

}
