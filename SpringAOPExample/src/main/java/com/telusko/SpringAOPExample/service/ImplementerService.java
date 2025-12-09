package com.telusko.SpringAOPExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringAOPExample.model.Implementer;
import com.telusko.SpringAOPExample.repo.IImplementerRepo;

@Service
public class ImplementerService implements IImplementerService 
{
	@Autowired	
	private IImplementerRepo repo;

	@Override
	public Implementer registerImplementerInfo(Implementer impl) 
	{
		String name=impl.getName();
		if(name.length()!=5)
			throw new RuntimeException("Invalid name length let it be 5 letter name");
		else
			return repo.save(impl);
		
	}

	@Override
	public List<Implementer> fetchAllImplementersInfo() {
		
		return repo.findAll();
	}

}
