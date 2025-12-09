package com.telusko.SpringAOPExample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SpringAOPExample.model.Implementer;

public interface IImplementerRepo extends JpaRepository<Implementer, Integer> 
{

}
