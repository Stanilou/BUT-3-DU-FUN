package com.iut.collaborateurs.service;

import com.iut.collaborateurs.entity.Departement;
import com.iut.collaborateurs.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartementService {

    @Autowired
    private DepartementRepository departementRepository;

    public List<Departement> getAllDepartements() {
        return departementRepository.findAll();
    }

    public Departement getDepartementById(int id) {
        Optional<Departement> departement = departementRepository.findById(id);
        return departement.orElse(null);
    }

    public Departement saveDepartement(Departement departement) {
        return departementRepository.save(departement);
    }
}
