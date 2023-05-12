package com.robvega.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.robvega.lookify.models.Lookify;
import com.robvega.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	private final LookifyRepository lookifyRepository;
	
	public LookifyService(LookifyRepository lookifyRepository) {
		this.lookifyRepository = lookifyRepository;
	}

	public List<Lookify> findAll() {
		return lookifyRepository.findAll();
	}
}
