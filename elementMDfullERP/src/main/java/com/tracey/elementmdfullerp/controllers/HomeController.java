package com.tracey.elementmdfullerp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tracey.elementmdfullerp.services.AdminService;

import jakarta.servlet.http.HttpSession;



@Controller
public class HomeController {
	
	private final AdminService adminServ;
	public HomeController(AdminService adminServ) {
		this.adminServ = adminServ;
	}
	
	@GetMapping("/")
	public String home(HttpSession session, Model model) {
		if(session.getAttribute("admin_id") == null) {
			return "redirect:/admins/login/register";
		}
		model.addAttribute("loggedInAdmin", adminServ.getAdmin((Long)session.getAttribute("admin_id")));
		return "/dashboard.jsp";
	}

}
