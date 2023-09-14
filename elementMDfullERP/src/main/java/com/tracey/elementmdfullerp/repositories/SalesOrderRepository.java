package com.tracey.elementmdfullerp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tracey.elementmdfullerp.models.SalesOrder;

@Repository
public interface SalesOrderRepository extends CrudRepository<SalesOrder, Long> {
	List<SalesOrder> findAll();
}
