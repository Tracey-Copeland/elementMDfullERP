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
import com.tracey.elementmdfullerp.models.PurchaseOrder;
import com.tracey.elementmdfullerp.services.MaterialService;
import com.tracey.elementmdfullerp.services.PurchaseOrderService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/purchaseorders")
public class PurchaseOrderController {

	private final PurchaseOrderService purchaseorderServ;
	private final MaterialService materialServ;
	public PurchaseOrderController(PurchaseOrderService purchaseorderServ, MaterialService materialServ) {
		this.purchaseorderServ = purchaseorderServ;
		this.materialServ = materialServ;
	}
	
	@GetMapping("/create")
	public String createPurchaseOrder(@ModelAttribute("purchaseorder")PurchaseOrder purchaseorder) {
		return "purchaseorder/create.jsp";
	}
	
	@PostMapping("/process/create")
	public String processCreatePurchaseOrder(@Valid @ModelAttribute("purchaseorder")PurchaseOrder purchaseorder, BindingResult result) {
		if(result.hasErrors()) {
			return "purchaseorder/create.jsp";
		}
		purchaseorderServ.create(purchaseorder);
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String showAllPurchaseOrders(Model model) {
		model.addAttribute("allPurchaseOrders", purchaseorderServ.getAll());
		return "purchaseorder/showAll.jsp";
	}
	
	@GetMapping("/{id}")
	public String showOnePurchaseOrder(@PathVariable("id") Long id, Model model) {
		model.addAttribute("purchaseorder", purchaseorderServ.getOne(id));
		return "purchaseorder/showOne.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editPurchaseOrder(@PathVariable("id") Long id, Model model,HttpSession session ) {
		model.addAttribute("purchaseorder", purchaseorderServ.getOne(id));
		return "purchaseorder/edit.jsp";
	}
	
	@PutMapping("/process/edit/{id}")
	public String processEditPurchaseOrder(@Valid @ModelAttribute("purchaseorder") PurchaseOrder purchaseorder, BindingResult result) {
		if(result.hasErrors()) {
			return "purchaseorder/edit.jsp";
		}
		
		Material currMat = purchaseorder.getMaterial();
		Integer currMatAmount = currMat.getAmountInStock();
		Integer currPurchaseOrderQuantity = purchaseorder.getQuantity();
		Integer progressCurrent = purchaseorder.getCurrProgressNum();
		
		if(progressCurrent == 4) {
			Integer newAmount = currMatAmount + currPurchaseOrderQuantity;
			currMat.setAmountInStock(newAmount);
		}
		purchaseorderServ.update(purchaseorder);
		return "redirect:/";
	}
		

}
