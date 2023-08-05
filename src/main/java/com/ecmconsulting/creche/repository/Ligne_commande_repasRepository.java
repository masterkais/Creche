package com.ecmconsulting.creche.repository;

import com.ecmconsulting.creche.entity.Ligne_commande_repas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ligne_commande_repasRepository extends JpaRepository<Ligne_commande_repas,Long> {

}
