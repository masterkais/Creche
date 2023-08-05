package com.ecmconsulting.creche.repository;

import com.ecmconsulting.creche.entity.Abonnement;
import com.ecmconsulting.creche.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {


    // Méthode pour récupérer les abonnements actifs
    List<Abonnement> findByDateFinAfter(Date dateFin);

    // Méthode pour récupérer les abonnements expirés
    @Query("SELECT a FROM Abonnement a WHERE a.dateFin < :date")
    List<Abonnement> findByDateFinBefore(Date date);

}
