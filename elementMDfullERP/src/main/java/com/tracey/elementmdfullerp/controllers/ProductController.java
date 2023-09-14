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
import com.tracey.elementmdfullerp.models.Product;
import com.tracey.elementmdfullerp.services.ProductService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/products")
public class ProductController {

	private final ProductService productServ;
	public ProductController(ProductService productServ) {
		this.productServ = productServ;
	}
	
	@GetMapping("/create")
	public String createProduct(@ModelAttribute("product")Product product) {
		return "product/create.jsp";
	}
	
	@PostMapping("/process/create")
	public String processCreateProduct(@Valid @ModelAttribute("product")Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "product/create.jsp";
		}
		productServ.create(product);
		return "redirect:/";
	}
	
	@GetMapping("/all")
	public String showAllProducts(Model model) {
		model.addAttribute("allProducts", productServ.getAll());
		return "product/showAll.jsp";
	} 
	
	@GetMapping("/inventory")
	public String showInventoryProducts(Model model) {
		model.addAttribute("allProducts", productServ.getAll());
		return "product/inventory.jsp";
	}
	
	@GetMapping("/{id}")
	public String showOneProduct(@PathVariable("id") Long id, Model model) {
		model.addAttribute("product", productServ.getOne(id));
		return "product/showOne.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editProduct(@PathVariable("id") Long id, Model model,HttpSession session ) {
		model.addAttribute("product", productServ.getOne(id));
		return "product/edit.jsp";
	}
	
	@PutMapping("/process/edit/{id}")
	public String processEditProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "product/edit.jsp";
		}
		productServ.update(product);
		return "redirect:/";
	}

}
