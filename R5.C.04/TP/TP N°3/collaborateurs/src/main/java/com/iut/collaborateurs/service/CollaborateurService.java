package com.iut.collaborateurs.service;

import com.iut.collaborateurs.entity.Collaborateur;
import com.iut.collaborateurs.repository.CollaborateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollaborateurService {

	@Autowired
	private CollaborateurRepository collaborateurRepository;
	
	public Collaborateur getCollaborateurById(int id) {
	    return collaborateurRepository.findById(id).orElse(null);
	}
	
	public List<Collaborateur> getAllCollaborateurs() {
	    return collaborateurRepository.findAll();
	}
	
	public Collaborateur saveCollaborateur(Collaborateur collaborateur) {
	    return collaborateurRepository.save(collaborateur);
	}

}
