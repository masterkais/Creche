package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Ligne_commande_repas;
import com.ecmconsulting.creche.repository.Commande_repasRepository;
import com.ecmconsulting.creche.repository.Ligne_commande_repasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ligne_commande_repasServiceImpl implements Ligne_commande_repasService{
    @Autowired
    Ligne_commande_repasRepository ligneCommandeRepasRepository;

    public Ligne_commande_repasServiceImpl(Ligne_commande_repasRepository ligneCommandeRepasRepository) {
        this.ligneCommandeRepasRepository = ligneCommandeRepasRepository;
    }

    @Override
    public Ligne_commande_repas createLigneCommandeRepas(Ligne_commande_repas ligneCommandeRepas) {
        return ligneCommandeRepasRepository.save(ligneCommandeRepas);
    }

    @Override
    public Ligne_commande_repas getLigneCommandeRepasById(Long idLCR) {
        return ligneCommandeRepasRepository.findById(idLCR).orElse(null);
    }

    @Override
    public List<Ligne_commande_repas> getAllLignesCommandeRepas() {
        return ligneCommandeRepasRepository.findAll();
    }

    @Override
    public Ligne_commande_repas updateLigneCommandeRepas(Long idLCR, Ligne_commande_repas ligneCommandeRepas) {
        if (ligneCommandeRepasRepository.existsById(idLCR)) {
            ligneCommandeRepas.setIdLCR(idLCR);
            ligneCommandeRepas.setQuantite(ligneCommandeRepas.getQuantite());
            return ligneCommandeRepasRepository.save(ligneCommandeRepas);
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteLigneCommandeRepas(Long id) {
        if (ligneCommandeRepasRepository.existsById(id)) {
            ligneCommandeRepasRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }


}
