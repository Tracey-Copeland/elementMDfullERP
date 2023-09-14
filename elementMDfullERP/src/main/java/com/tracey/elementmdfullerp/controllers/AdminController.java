package com.tracey.elementmdfullerp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tracey.elementmdfullerp.models.Admin;
import com.tracey.elementmdfullerp.models.LoginAdmin;
import com.tracey.elementmdfullerp.services.AdminService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/admins")
public class AdminController {
	
	private final AdminService adminServ;

	public AdminController(AdminService adminServ) {
		this.adminServ = adminServ;
	}
	
	@GetMapping("/login/register")
	public String loginReg(@ModelAttribute("newAdmin") Admin admin, Model model) {
		model.addAttribute("loginAdmin", new LoginAdmin());
		
		
		return "/loginReg.jsp";
	}
	
	@PostMapping("/process/register")
	public String processRegister(@Valid @ModelAttribute("newAdmin") Admin admin,BindingResult result, Model model, HttpSession session) {
		
		if(adminServ.getAdmin(admin.getEmail()) != null) {
			result.rejectValue("email","Unique", "Email is already in use");	
		}
		
		if(!admin.getPassword().equals(admin.getConfirm())) {
			result.rejectValue("password","Match", "passwords don't match");	
		}
		
		
		
		if(result.hasErrors()) {
			model.addAttribute("loginAdmin", new LoginAdmin());
			return "/loginReg.jsp";
		}
		Admin newAdmin = adminServ.createAdmin(admin);
		session.setAttribute("admin_id", newAdmin.getId());
		
		return "redirect:/";
	}
	
	@PostMapping("/process/login")
	public String processLogin(@Valid @ModelAttribute("loginAdmin") LoginAdmin loginAdmin, BindingResult result,Model model, HttpSession session ) {
		Admin loggingAdmin = adminServ.login(loginAdmin, result);
		if(result.hasErrors()) {
			model.addAttribute("newAdmin", new Admin());
			return "/loginReg.jsp";
		}	
		session.setAttribute("admin_id", loggingAdmin.getId());
		
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logoutAdmin(HttpSession session) {
		session.invalidate();
		return "redirect:/admins/login/register";
	}

}
