package com.tracey.elementmdfullerp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tracey.elementmdfullerp.models.PurchaseOrder;

@Repository
public interface PurchaseOrderRepository extends CrudRepository<PurchaseOrder, Long> {
	List<PurchaseOrder> findAll();
}
