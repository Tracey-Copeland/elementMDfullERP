package com.tracey.elementmdfullerp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tracey.elementmdfullerp.models.Assets;

@Repository
public interface AssetsRepository extends CrudRepository<Assets, Long>{
	List<Assets> findAll();
}
