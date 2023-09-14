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

import com.tracey.elementmdfullerp.models.Customer;
import com.tracey.elementmdfullerp.models.Supplier;
import com.tracey.elementmdfullerp.services.PurchaseOrderService;
import com.tracey.elementmdfullerp.services.SupplierService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/suppliers")
public class SupplierController {

	private final SupplierService supplierServ;
	private final PurchaseOrderService purchaseorderServ;
	public SupplierController(SupplierService supplierServ,PurchaseOrderService purchaseorderServ) {
		this.supplierServ = supplierServ;
		this.purchaseorderServ = purchaseorderServ;
	}
	
	@GetMapping("/create")
	public String createSupplier(@ModelAttribute("supplier")Supplier supplier) {
		return "supplier/create.jsp";
	}
	
	@PostMapping("/process/create")
	public String processCreateSupplier(@Valid @ModelAttribute("supplier")Supplier supplier, BindingResult result) {
		if(result.hasErrors()) {
			return "supplier/create.jsp";
		}
		supplierServ.create(supplier);
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String showAllSuppliers(Model model) {
		model.addAttribute("allSuppliers", supplierServ.getAll());
		return "supplier/showAll.jsp";
	}
	
	@GetMapping("/{id}")
	public String showOneSupplier(@PathVariable("id") Long id, Model model) {
		model.addAttribute("supplier", supplierServ.getOne(id));
		model.addAttribute("allPurchaseOrders", purchaseorderServ.getAll());
		return "supplier/showOne.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editSupplier(@PathVariable("id") Long id, Model model,HttpSession session ) {
		model.addAttribute("supplier", supplierServ.getOne(id));
		return "supplier/edit.jsp";
	}
	
	@PutMapping("/process/edit/{id}")
	public String processEditSupplier(@Valid @ModelAttribute("supplier") Supplier supplier, BindingResult result) {
		if(result.hasErrors()) {
			return "supplier/edit.jsp";
		}
		supplierServ.update(supplier);
		return "redirect:/";
	}
	

}
