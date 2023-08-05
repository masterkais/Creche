package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Ligne_commande_repas;

import java.util.List;

public interface Ligne_commande_repasService {
    Ligne_commande_repas createLigneCommandeRepas(Ligne_commande_repas ligneCommandeRepas);

    Ligne_commande_repas getLigneCommandeRepasById(Long idLCR);
    List<Ligne_commande_repas> getAllLignesCommandeRepas();

    Ligne_commande_repas updateLigneCommandeRepas(Long idLCR, Ligne_commande_repas ligneCommandeRepas);

    boolean deleteLigneCommandeRepas(Long idLCR);


}
