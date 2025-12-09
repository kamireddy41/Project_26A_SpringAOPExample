package com.telusko.SpringAOPExample.service;

import java.util.List;

import com.telusko.SpringAOPExample.model.Implementer;

public interface IImplementerService 
{
	
	Implementer registerImplementerInfo(Implementer impl);
	
	List<Implementer> fetchAllImplementersInfo();

}
