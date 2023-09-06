package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Enfant;
import com.ecmconsulting.creche.repository.EnfantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EnfantServiceImpl implements EnfantService{
    private final EnfantRepository enfantRepository;

    @Autowired
    public EnfantServiceImpl(EnfantRepository enfantRepository) {
        this.enfantRepository = enfantRepository;
    }

    @Override
    public List<Enfant> getAllEnfants() {
        return enfantRepository.findAll();
    }

    @Override
    public Enfant getEnfantById(Long id) {
        return enfantRepository.findById(id).orElse(null);
    }

    @Override
    public Enfant saveEnfant(Enfant enfant) {
        return enfantRepository.save(enfant);
    }

    @Override
    public Enfant updateEnfant(Long idenfant, Enfant enfant) {
        Optional<Enfant> existingEnfant = enfantRepository.findById(idenfant);
        if (existingEnfant.isPresent()) {
            enfant.setIdenfant(idenfant);
            return enfantRepository.save(enfant);
        } else {
            return null;
        }
    }

    @Override
    public void deleteEnfant(Long id) {
        enfantRepository.deleteById(id);
    }

}
