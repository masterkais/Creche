package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Suivi_enfant;
import com.ecmconsulting.creche.repository.Suivi_enfantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Suivi_enfanrServiceImpl implements Suivi_enfantService {
    @Autowired
    Suivi_enfantRepository RepSuiv;

    @Override
    public Suivi_enfant AjouterSuivi(Suivi_enfant S) {
        RepSuiv.save(S);
        return S;
    }

    @Override
    public void DeleteSuivi(Suivi_enfant S) {
        RepSuiv.delete(S);
    }

    @Override
    public void DeleteSuivi(Long idSuiv) {
        RepSuiv.deleteById(idSuiv);
    }

    @Override
    public List<Suivi_enfant> getALLSuivie() {
        return RepSuiv.findAll();
    }

    @Override
    public Suivi_enfant UpdateSuivi(Suivi_enfant S) {
        RepSuiv.save(S);
        return S;
    }

    @Override
    public void afficher() {
        System.out.println(toString());
    }
}
