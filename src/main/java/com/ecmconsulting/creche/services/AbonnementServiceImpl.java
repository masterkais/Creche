package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Abonnement;
import com.ecmconsulting.creche.entity.Utilisateur;
import com.ecmconsulting.creche.repository.AbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AbonnementServiceImpl implements AbonnementService {
    @Autowired
    private AbonnementRepository abonnementRepository;

    @Override
    public Abonnement créerAbonnement(Abonnement abonnement) {

        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement obtenirAbonnementParId(Long idabo) {
        return abonnementRepository.findById(idabo).orElse(null);
    }
    @Override
    public List<Abonnement> obtenirTousLesAbonnements() {
        return abonnementRepository.findAll();
    }

    @Override
    public void mettreAJourAbonnement(Abonnement abonnement) {
        abonnementRepository.save(abonnement);
    }

    @Override
    public void supprimerAbonnementParId(Long idabo) {
        abonnementRepository.deleteById(idabo);
    }

    @Override
    public List<Abonnement> trouverAbonnementsActifs(Date dateFin) {
        return abonnementRepository.findByDateFinAfter(dateFin);
    }

    @Override
    public List<Abonnement> trouverAbonnementsExpirés(Date dateFin) {
        return abonnementRepository.findByDateFinBefore(dateFin);
    }


}
