package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Commande_repas;
import com.ecmconsulting.creche.entity.Facture_repas;
import com.ecmconsulting.creche.repository.Commande_repasRepository;
import com.ecmconsulting.creche.repository.Facture_repasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facture_repasServiceImpl implements Facture_repasService{


    @Autowired
    Facture_repasRepository factureRepasRepository;
    public Facture_repasServiceImpl(Facture_repasRepository factureRepasRepository) {
        this.factureRepasRepository = factureRepasRepository;
    }
    @Override
    public Facture_repas createFactureRepas(Facture_repas factureRepas) {
        return factureRepasRepository.save(factureRepas);
    }


    @Override
    public Facture_repas getFactureRepasById(Long idFacR) {
        return factureRepasRepository.findById(idFacR).orElse(null);
    }

    @Override
    public List<Facture_repas> getAllFactureRepas() {
        return factureRepasRepository.findAll();
    }

    @Override
    public Facture_repas updateFactureRepas(Long idFacR, Facture_repas factureRepas) {
        if (factureRepasRepository.existsById(idFacR)) {
            factureRepas.setIdFacR(idFacR);
            return factureRepasRepository.save(factureRepas);
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteFactureRepas(Long idFacR) {
        if (factureRepasRepository.existsById(idFacR)) {
            factureRepasRepository.deleteById(idFacR);
            return true;
        } else {
            return false;
        }
    }




}
