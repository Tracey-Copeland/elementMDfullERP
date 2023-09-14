package com.tracey.elementmdfullerp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tracey.elementmdfullerp.models.SingleProductionOrderMaterial;
import com.tracey.elementmdfullerp.repositories.SingleProductionOrderMaterialRepository;

@Service
public class SingleProductionOrderMaterialService {

	private final SingleProductionOrderMaterialRepository singleproductionordermaterialRepo;
	public SingleProductionOrderMaterialService(SingleProductionOrderMaterialRepository singleproductionordermaterialRepo) {
		this.singleproductionordermaterialRepo = singleproductionordermaterialRepo;
	}
	
	public List<SingleProductionOrderMaterial> getAll(){
		return singleproductionordermaterialRepo.findAll();
	}
	
	public SingleProductionOrderMaterial create(SingleProductionOrderMaterial singleproductionordermaterial) {
		return singleproductionordermaterialRepo.save(singleproductionordermaterial);
	}
	
	public SingleProductionOrderMaterial getOne(Long id) {
		Optional<SingleProductionOrderMaterial> optionalSingleProductionOrderMaterial = singleproductionordermaterialRepo.findById(id);
		if(optionalSingleProductionOrderMaterial.isPresent()) {
			return optionalSingleProductionOrderMaterial.get();
		}
		return null;
	}

}
