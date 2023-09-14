package com.tracey.elementmdfullerp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tracey.elementmdfullerp.models.Product;
import com.tracey.elementmdfullerp.repositories.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository productRepo;
	public ProductService(ProductRepository productRepo) {
		this.productRepo = productRepo;
	}
	
	public List<Product> getAll(){
		return productRepo.findAll();
	}
	
	public Product create(Product product) {
		return productRepo.save(product);
	}
	
	public Product getOne(Long id) {
		Optional<Product> optionalProduct = productRepo.findById(id);
		if(optionalProduct.isPresent()) {
			return optionalProduct.get();
		}
		return null;
	}
	
	public Product update(Product product) {
		return productRepo.save(product);
	}

}
