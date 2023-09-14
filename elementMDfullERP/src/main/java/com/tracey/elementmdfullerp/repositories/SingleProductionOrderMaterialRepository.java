package com.tracey.elementmdfullerp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tracey.elementmdfullerp.models.SingleProductionOrderMaterial;

@Repository
public interface SingleProductionOrderMaterialRepository extends CrudRepository<SingleProductionOrderMaterial, Long> {
	List<SingleProductionOrderMaterial> findAll();
}
