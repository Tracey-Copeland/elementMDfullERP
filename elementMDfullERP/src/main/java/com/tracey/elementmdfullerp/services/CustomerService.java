package com.tracey.elementmdfullerp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tracey.elementmdfullerp.models.Customer;
import com.tracey.elementmdfullerp.repositories.CustomerRepository;

@Service
public class CustomerService {

	private final CustomerRepository customerRepo;
	public CustomerService(CustomerRepository customerRepo) {
		this.customerRepo = customerRepo;
	}
	
	public List<Customer> getAll(){
		return customerRepo.findAll();
	}
	
	public Customer create(Customer customer) {
		return customerRepo.save(customer);
	}
	
	public Customer getOne(Long id) {
		Optional<Customer> optionalCustomer = customerRepo.findById(id);
		if(optionalCustomer.isPresent()) {
			return optionalCustomer.get();
		}
		return null;
	}
	
	public Customer update(Customer customer) {
		return customerRepo.save(customer);
	}

}
