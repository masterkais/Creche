package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Abonnement;
import com.ecmconsulting.creche.entity.Utilisateur;

import java.util.Date;
import java.util.List;

public interface AbonnementService {
    Abonnement créerAbonnement(Abonnement abonnement);
    Abonnement obtenirAbonnementParId(Long idAbo);
    List<Abonnement> obtenirTousLesAbonnements();
    void mettreAJourAbonnement(Abonnement abonnement);
    void supprimerAbonnementParId(Long idAbo);
    List<Abonnement> trouverAbonnementsActifs(Date dateFin);
    List<Abonnement> trouverAbonnementsExpirés(Date ddateFin);

}
