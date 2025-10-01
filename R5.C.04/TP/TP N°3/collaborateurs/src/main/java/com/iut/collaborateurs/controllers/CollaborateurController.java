package com.iut.collaborateurs.controllers;

import com.iut.collaborateurs.entity.Collaborateur;
import com.iut.collaborateurs.service.CollaborateurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/collaborateurs")
public class CollaborateurController {

	@Autowired
	private CollaborateurService collaborateurService;
	
	@GetMapping("/{id}")
	public Collaborateur listerCollaborateurParId(@PathVariable("id") int id) {
	    return this.collaborateurService.getCollaborateurById(id);
	}
	
	@GetMapping
	public List<Collaborateur> listerCollaborateurs() {
	    return this.collaborateurService.getAllCollaborateurs();
	}

}
