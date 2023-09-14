package com.tracey.elementmdfullerp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tracey.elementmdfullerp.models.Supplier;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Long> {
	List<Supplier> findAll();
}
