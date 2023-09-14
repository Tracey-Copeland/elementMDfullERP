package com.tracey.elementmdfullerp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tracey.elementmdfullerp.models.ProductionOrder;
import com.tracey.elementmdfullerp.repositories.ProductionOrderRepository;

@Service
public class ProductionOrderService {

	private final ProductionOrderRepository productionorderRepo;
	
	public ProductionOrderService(ProductionOrderRepository productionorderRepo) {
		this.productionorderRepo = productionorderRepo;
	}
	
	public List<ProductionOrder> getAll(){
		return productionorderRepo.findAll();
	}
	
	public ProductionOrder create(ProductionOrder productionorder) {
		return productionorderRepo.save(productionorder);
	}
	
	public ProductionOrder getOne(Long id) {
		Optional<ProductionOrder> optionalProductionOrder = productionorderRepo.findById(id);
		if(optionalProductionOrder.isPresent()) {
			return optionalProductionOrder.get();
		}
		return null;
	}
	
	public ProductionOrder update(ProductionOrder productionorder) {
		return productionorderRepo.save(productionorder);
	}


}
