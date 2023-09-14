package com.tracey.elementmdfullerp.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.tracey.elementmdfullerp.models.Admin;
import com.tracey.elementmdfullerp.models.LoginAdmin;
import com.tracey.elementmdfullerp.repositories.AdminRepository;

@Service
public class AdminService {

	private final AdminRepository adminRepo;
	
	public AdminService(AdminRepository adminRepo) {
		this.adminRepo = adminRepo;
	}
	
	public Admin createAdmin(Admin registerringAdmin) {
		String hashed = BCrypt.hashpw(registerringAdmin.getPassword(), BCrypt.gensalt());
		registerringAdmin.setPassword(hashed);
		return adminRepo.save(registerringAdmin);

	}
	
	public Admin getAdmin(String Email) {
		Optional<Admin> potentialAdmin = adminRepo.findByEmail(Email);
		return potentialAdmin.isPresent() ? potentialAdmin.get() : null;
	}
	
	public Admin getAdmin(Long id) {
		Optional<Admin> potentialAdmin = adminRepo.findById(id);
		return potentialAdmin.isPresent() ? potentialAdmin.get() : null;
	}
	
	public Admin login(LoginAdmin loginAdmin, BindingResult result) {
		if(result.hasErrors()) {
			return null;
		}
		Admin existingAdmin = getAdmin(loginAdmin.getEmail());
		if(existingAdmin == null) {
			result.rejectValue("email","Unique", "Bad Creds" );
			return null;
		}
		if(!BCrypt.checkpw(loginAdmin.getPassword(), existingAdmin.getPassword())) {
			result.rejectValue("email","Unique", "Bad Creds");
			return null;
		}
		return existingAdmin;
	}
	

}
