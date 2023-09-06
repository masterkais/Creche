package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Enfant;

import java.util.List;

public interface EnfantService {
    List<Enfant> getAllEnfants();
    Enfant getEnfantById(Long id);
    Enfant saveEnfant(Enfant enfant);
    Enfant updateEnfant(Long id, Enfant enfant);
    void deleteEnfant(Long id);
}
