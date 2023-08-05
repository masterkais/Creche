package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Enfant;
import com.ecmconsulting.creche.repository.EnfantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EnfantServiceImpl implements EnfantService{
    @Autowired
    EnfantRepository RepEnf;
    @Override
    public Enfant AjouterEnfant(Enfant E) {
        RepEnf.save(E);
        return E;
    }

    @Override
    public void DeleteEnfant(Enfant E) {
        RepEnf.delete(E);
    }

    @Override
    public void DeleteEnfant(Long idEnf) {
        RepEnf.deleteById(idEnf);
    }

    @Override
    public Enfant UpdateEnfant(Enfant E) {
        RepEnf.save(E);
        return E;
    }

    @Override
    public List<Enfant> getAllEnfant() {
        return RepEnf.findAll();
    }
}
