package com.tracey.elementmdfullerp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tracey.elementmdfullerp.models.Material;
import com.tracey.elementmdfullerp.repositories.MaterialRepository;

@Service
public class MaterialService {

	private final MaterialRepository materialRepo;
	public MaterialService(MaterialRepository materialRepo) {
		this.materialRepo = materialRepo;
	}
	
	public List<Material> getAll(){
		return materialRepo.findAll();
	}
	
	public Material create(Material material) {
		return materialRepo.save(material);
	}
	
	public Material getOne(Long id) {
		Optional<Material> optionalMaterial = materialRepo.findById(id);
		if(optionalMaterial.isPresent()) {
			return optionalMaterial.get();
		}
		return null;
	}
	
	public Material update(Material material) {
		return materialRepo.save(material);
	}
	
	public String delete(Long id) {
		materialRepo.deleteById(id);
		return id + " has been deleted";
	}

}
