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
import com.tracey.elementmdfullerp.services.CustomerService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	private final CustomerService customerServ;
	public CustomerController(CustomerService customerServ) {
		this.customerServ = customerServ;
	}
	
	@GetMapping("/create")
	public String createCustomer(@ModelAttribute("customer")Customer customer) {
		return "customer/create.jsp";
	}
	
	@PostMapping("/process/create")
	public String processCreateCustomer(@Valid @ModelAttribute("customer")Customer customer, BindingResult result) {
		if(result.hasErrors()) {
			return "customer/create.jsp";
		}
		customerServ.create(customer);
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String showAllCustomers(Model model) {
		model.addAttribute("allCustomers", customerServ.getAll());
		return "customer/showAll.jsp";
	}
	
	@GetMapping("/{id}")
	public String showOneCustomer(@PathVariable("id") Long id, Model model) {
		model.addAttribute("customer", customerServ.getOne(id));
		return "customer/showOne.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editCustomer(@PathVariable("id") Long id, Model model,HttpSession session ) {
		model.addAttribute("customer", customerServ.getOne(id));
		return "customer/edit.jsp";
	}
	
	@PutMapping("/process/edit/{id}")
	public String processEditCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		if(result.hasErrors()) {
			return "customer/edit.jsp";
		}
		customerServ.update(customer);
		return "redirect:/";
	}

}
