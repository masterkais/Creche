package com.ecmconsulting.creche.repository;

import com.ecmconsulting.creche.entity.Message;
import com.ecmconsulting.creche.entity.Suivi_enfant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Suivi_enfantRepository extends JpaRepository<Suivi_enfant,Long>{
}
