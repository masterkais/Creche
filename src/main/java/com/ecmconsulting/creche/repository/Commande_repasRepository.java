package com.ecmconsulting.creche.repository;

import com.ecmconsulting.creche.entity.Commande_repas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Commande_repasRepository extends JpaRepository<Commande_repas, Long> {
}
