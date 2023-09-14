package com.tracey.elementmdfullerp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tracey.elementmdfullerp.models.Admin;


@Repository
public interface AdminRepository extends CrudRepository<Admin, Long>{
	Optional<Admin> findByEmail(String email);
}

