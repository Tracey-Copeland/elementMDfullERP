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

import com.tracey.elementmdfullerp.models.Product;
import com.tracey.elementmdfullerp.models.SalesOrder;
import com.tracey.elementmdfullerp.services.ProductService;
import com.tracey.elementmdfullerp.services.SalesOrderService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/salesorders")
public class SalesOrderController {

	private final SalesOrderService salesorderServ;
	private final ProductService productServ;
	public SalesOrderController(SalesOrderService salesorderServ, ProductService productServ) {
		this.salesorderServ = salesorderServ;
		this.productServ = productServ;
	}
	
	@GetMapping("/create")
	public String createSalesOrder(@ModelAttribute("salesorder")SalesOrder salesorder) {
		return "salesorder/create.jsp";
	}
	
	@PostMapping("/process/create")
	public String processCreateSalesOrder(@Valid @ModelAttribute("salesorder")SalesOrder salesorder, BindingResult result) {
		if(result.hasErrors()) {
			return "salesorder/create.jsp";
		}
		salesorderServ.create(salesorder);
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String showAllSalesOrders(Model model) {
		model.addAttribute("allSalesOrders", salesorderServ.getAll());
		return "salesorder/showAll.jsp";
	}
	
	@GetMapping("/{id}")
	public String showOneSalesOrder(@PathVariable("id") Long id, Model model) {
		model.addAttribute("salesorder", salesorderServ.getOne(id));
		return "salesorder/showOne.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editSalesOrder(@PathVariable("id") Long id, Model model,HttpSession session ) {
		
		model.addAttribute("salesorder", salesorderServ.getOne(id));
		return "salesorder/edit.jsp";
	}
	
	@PutMapping("/process/edit/{id}")
	public String processEditSalesOrder(@Valid @ModelAttribute("salesorder") SalesOrder salesorder, BindingResult result) {
		if(result.hasErrors()) {
			return "salesorder/edit.jsp";
		}
		Product currProduct = salesorder.getProduct();
		Integer currProductAmount = currProduct.getAmountInStock();
		Integer currSalesOrderQuantity = salesorder.getQuantity();
		Integer progressCurrent = salesorder.getCurrProgressNum();
		Integer compareCurrent = 4;
		
		if(progressCurrent == compareCurrent) {
			Integer newAmount = currProductAmount - currSalesOrderQuantity;
			currProduct.setAmountInStock(newAmount);
		}
		salesorderServ.update(salesorder);
		productServ.update(currProduct);
		return "redirect:/";
	}

}
