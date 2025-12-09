package com.telusko.SpringAOPExample.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.SpringAOPExample.model.Implementer;
import com.telusko.SpringAOPExample.service.IImplementerService;

@RestController
@RequestMapping("/api")
public class ImplementerController
{
	@Autowired
	private IImplementerService service;
	
	@PostMapping("/addimplementer")
	public ResponseEntity<Implementer> registerImplementer(@RequestBody Implementer impl)
	{
		Implementer im=service.registerImplementerInfo(impl);
		return new ResponseEntity<Implementer>(im, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getallimplementers")
	public ResponseEntity<List> getAllImplementers()
	{
		List<Implementer> list = service.fetchAllImplementersInfo();
		return new ResponseEntity<List>(list, HttpStatus.OK);

	}

}
