package com.robvega.lookify.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.robvega.lookify.models.Lookify;
import com.robvega.lookify.repositories.LookifyRepository;

public class LookifyService {
	private LookifyRepository lookifyRepository;
	
	public LookifyService(LookifyRepository lookifyRepository) {
		this.lookifyRepository = lookifyRepository;
	}

	public List<Lookify> findAll() {
		return lookifyRepository.findAll();
	}
}
