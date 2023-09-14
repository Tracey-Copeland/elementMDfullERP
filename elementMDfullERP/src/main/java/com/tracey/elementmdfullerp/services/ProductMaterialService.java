package com.tracey.elementmdfullerp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tracey.elementmdfullerp.models.ProductMaterial;
import com.tracey.elementmdfullerp.repositories.ProductMaterialRepository;

@Service
public class ProductMaterialService {

	private final ProductMaterialRepository productmaterialRepo;
	public ProductMaterialService(ProductMaterialRepository productmaterialRepo) {
		this.productmaterialRepo = productmaterialRepo;
	}
	
	public List<ProductMaterial> getAll(){
		return productmaterialRepo.findAll();
	}
	
	public ProductMaterial create(ProductMaterial productmaterial) {
		return productmaterialRepo.save(productmaterial);
	}
	
	public ProductMaterial getOne(Long id) {
		Optional<ProductMaterial> optionalProductMaterial = productmaterialRepo.findById(id);
		if(optionalProductMaterial.isPresent()) {
			return optionalProductMaterial.get();
		}
		return null;
	}
	
	public ProductMaterial update(ProductMaterial productmaterial) {
		return productmaterialRepo.save(productmaterial);
	}

}
