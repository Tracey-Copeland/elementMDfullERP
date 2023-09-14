package com.tracey.elementmdfullerp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.tracey.elementmdfullerp.models.PurchaseOrder;
import com.tracey.elementmdfullerp.repositories.PurchaseOrderRepository;

@Service
public class PurchaseOrderService {

	private final PurchaseOrderRepository purchaseorderRepo;
	
	public PurchaseOrderService(PurchaseOrderRepository purchaseorderRepo) {
		this.purchaseorderRepo = purchaseorderRepo;
	}
	
	public List<PurchaseOrder> getAll(){
		return purchaseorderRepo.findAll();
	}
	
	public PurchaseOrder create(PurchaseOrder purchaseorder) {
		return purchaseorderRepo.save(purchaseorder);
	}
	
	public PurchaseOrder getOne(Long id) {
		Optional<PurchaseOrder> optionalPurchaseOrder = purchaseorderRepo.findById(id);
		if(optionalPurchaseOrder.isPresent()) {
			return optionalPurchaseOrder.get();
		}
		return null;
	}
	
	public PurchaseOrder update(PurchaseOrder purchaseorder) {
		return purchaseorderRepo.save(purchaseorder);
	}

}
