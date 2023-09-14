package com.tracey.elementmdfullerp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tracey.elementmdfullerp.models.PurchaseOrder;
import com.tracey.elementmdfullerp.models.SalesOrder;
import com.tracey.elementmdfullerp.repositories.SalesOrderRepository;

@Service
public class SalesOrderService {

	private final SalesOrderRepository salesorderRepo;
	public SalesOrderService(SalesOrderRepository salesorderRepo) {
		this.salesorderRepo = salesorderRepo;
	}
	
	public List<SalesOrder> getAll(){
		return salesorderRepo.findAll();
	}
	
	public SalesOrder create(SalesOrder salesorder) {
		return salesorderRepo.save(salesorder);
	}
	
	public SalesOrder getOne(Long id) {
		Optional<SalesOrder> optionalSalesOrder = salesorderRepo.findById(id);
		if(optionalSalesOrder.isPresent()) {
			return optionalSalesOrder.get();
		}
		return null;
	}
	
	public SalesOrder update(SalesOrder salesorder) {
		return salesorderRepo.save(salesorder);
	}
	


}
