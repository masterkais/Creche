package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Commande_repas;
import com.ecmconsulting.creche.entity.Ligne_commande_repas;

import java.util.List;

public interface Commande_repasService {
    Commande_repas createCommandeRepas(Commande_repas commandeRepas);

    Commande_repas getCommandeRepasById(Long idComRep);
    List<Commande_repas> getAllCommandeRepas();

    Commande_repas updateCommandeRepas(Long idComRep, Commande_repas commandeRepas);

    boolean deleteCommandeRepas(Long idComRep);

}
