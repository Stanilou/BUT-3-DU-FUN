package com.iut.collaborateurs.controllers;

import com.iut.collaborateurs.entity.Departement;
import com.iut.collaborateurs.service.DepartementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/departements")
public class DepartementsController {

	@Autowired
	private DepartementService departementService;
	
	@GetMapping("/{id}")
	public Departement listerDepartementParId(@PathVariable("id") String id) {
	    return this.departementService.getDepartementById(Integer.valueOf(id));
	}
	
	@GetMapping
	public List<Departement> listerDepartements() {
	    return this.departementService.getAllDepartements();
	}
	
}
