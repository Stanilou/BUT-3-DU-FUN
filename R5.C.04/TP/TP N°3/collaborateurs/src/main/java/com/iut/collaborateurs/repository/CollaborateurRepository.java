package com.iut.collaborateurs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iut.collaborateurs.entity.Collaborateur;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface CollaborateurRepository extends JpaRepository<Collaborateur, Integer> {
	
}
