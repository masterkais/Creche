package com.ecmconsulting.creche.repository;

import com.ecmconsulting.creche.entity.Facture_repas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Facture_repasRepository extends JpaRepository<Facture_repas,Long> {

}
