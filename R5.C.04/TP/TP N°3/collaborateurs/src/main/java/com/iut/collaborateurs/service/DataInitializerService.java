package com.iut.collaborateurs.service;

import com.iut.collaborateurs.entity.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataInitializerService {

	@Autowired
	private DepartementService departementService;
	
	public void initialiser() {
	    Departement d1 = new Departement(1, "Informatique");
	    Departement d2 = new Departement(2, "Ressources Humaines");
	    Departement d3 = new Departement(3, "Comptabilité");
	    Departement d4 = new Departement(4, "Marketing");
	    Departement d5 = new Departement(5, "Direction");
	
	    departementService.saveDepartement(d1);
	    departementService.saveDepartement(d2);
	    departementService.saveDepartement(d3);
	    departementService.saveDepartement(d4);
	    departementService.saveDepartement(d5);
	}

}
