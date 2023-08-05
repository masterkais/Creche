package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Abonnement;
import com.ecmconsulting.creche.entity.Facture;

import java.util.List;

public interface FactureService {
    List<Facture> getAllFactures();

    Facture getFactureById(Long idFact);

    List<Facture> getFacturesByAbonnement(Abonnement abonnement);

    Facture createFacture(Facture facture);

    Facture updateFacture(Long idFact, Facture facture);

    boolean deleteFacture(Long idFact);

    List<Facture> getFacturesByEtat(int etat);
    List<Facture> getAllUnpaidFactures();
    double getTotalPaidAmount();
}
