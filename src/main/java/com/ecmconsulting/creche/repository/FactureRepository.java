package com.ecmconsulting.creche.repository;

import com.ecmconsulting.creche.entity.Abonnement;
import com.ecmconsulting.creche.entity.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {
    List<Facture> findByAbonnement(Abonnement abonnement);
    List<Facture> findByEtat(int etat);
    @Query("SELECT SUM(f.total) FROM Facture f WHERE f.etat = 1")
    Double getTotalPaidAmount();
}
