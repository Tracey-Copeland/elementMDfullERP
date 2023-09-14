package com.tracey.elementmdfullerp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tracey.elementmdfullerp.models.ProductMaterial;

@Repository
public interface ProductMaterialRepository extends CrudRepository<ProductMaterial, Long>{
	List<ProductMaterial> findAll();
}
