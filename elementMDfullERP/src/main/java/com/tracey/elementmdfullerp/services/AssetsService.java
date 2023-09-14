package com.tracey.elementmdfullerp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tracey.elementmdfullerp.models.Assets;
import com.tracey.elementmdfullerp.repositories.AssetsRepository;

@Service
public class AssetsService {

	private final AssetsRepository assetsRepo;
	public AssetsService(AssetsRepository assetsRepo) {
		this.assetsRepo = assetsRepo;
	}
	
	public List<Assets> getAll(){
		return assetsRepo.findAll();
	}
	
	public Assets create(Assets Assets) {
		return assetsRepo.save(Assets);
	}
	
	public Assets getOne(Long id) {
		Optional<Assets> optionalAssets = assetsRepo.findById(id);
		if(optionalAssets.isPresent()) {
			return optionalAssets.get();
		}
		return null;
	}
	
	public Assets update(Assets Assets) {
		return assetsRepo.save(Assets);
	}

}
