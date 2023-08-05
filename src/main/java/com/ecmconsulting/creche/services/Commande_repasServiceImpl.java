package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Commande_repas;
import com.ecmconsulting.creche.entity.Facture_repas;
import com.ecmconsulting.creche.entity.Ligne_commande_repas;
import com.ecmconsulting.creche.repository.Commande_repasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Commande_repasServiceImpl implements Commande_repasService{


    @Autowired
    Commande_repasRepository commandeRepasRepository;

    public Commande_repasServiceImpl(Commande_repasRepository commandeRepasRepository) {
        this.commandeRepasRepository = commandeRepasRepository;
    }
    @Override
    public Commande_repas createCommandeRepas(Commande_repas commandeRepas) {
        return commandeRepasRepository.save(commandeRepas);
    }

    @Override
    public Commande_repas getCommandeRepasById(Long idComRep) {
        return commandeRepasRepository.findById(idComRep).orElse(null);
    }

    @Override
    public List<Commande_repas> getAllCommandeRepas() {
        return commandeRepasRepository.findAll();
    }

    @Override
    public Commande_repas updateCommandeRepas(Long idComRep, Commande_repas commandeRepas) {
        if (commandeRepasRepository.existsById(idComRep)) {
            commandeRepas.setIdComRep(idComRep);
            commandeRepas.setEtat(commandeRepas.getEtat());
            return commandeRepasRepository.save(commandeRepas);
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteCommandeRepas(Long idComRep) {
        if (commandeRepasRepository.existsById(idComRep)) {
            commandeRepasRepository.deleteById(idComRep);
            return true;
        } else {
            return false;
        }
    }



}
