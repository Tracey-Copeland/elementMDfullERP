package com.tracey.elementmdfullerp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tracey.elementmdfullerp.models.Supplier;
import com.tracey.elementmdfullerp.repositories.SupplierRepository;

@Service
public class SupplierService {

	private final SupplierRepository supplierRepo;
	public SupplierService(SupplierRepository supplierRepo) {
		this.supplierRepo = supplierRepo;	
	}
	
	public List<Supplier> getAll(){
		return supplierRepo.findAll();
	}
	
	public Supplier create(Supplier supplier) {
		return supplierRepo.save(supplier);
	}
	
	public Supplier getOne(Long id) {
		Optional<Supplier> optionalSupplier = supplierRepo.findById(id);
		if(optionalSupplier.isPresent()) {
			return optionalSupplier.get();
		}
		return null;
	}
	
	public Supplier update(Supplier supplier) {
		return supplierRepo.save(supplier);
	}
	
	public String delete(Long id) {
		supplierRepo.deleteById(id);
		return id + " has been deleted";
	}

}
