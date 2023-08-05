package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Enfant;

import java.util.List;

public interface EnfantService {
    Enfant AjouterEnfant(Enfant E);
    void DeleteEnfant(Enfant E);
    void DeleteEnfant(Long idEnf);

    List<Enfant> getAllEnfant();
    Enfant UpdateEnfant(Enfant E);
}
