package com.ecmconsulting.creche.repository;

import com.ecmconsulting.creche.entity.Enfant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnfantRepository extends JpaRepository<Enfant, Long> {
}
