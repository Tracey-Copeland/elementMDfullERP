package com.tracey.elementmdfullerp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tracey.elementmdfullerp.models.Material;

@Repository
public interface MaterialRepository extends CrudRepository<Material, Long> {
	List<Material> findAll();
}
