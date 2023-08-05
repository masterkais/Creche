package com.ecmconsulting.creche.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecmconsulting.creche.entity.Document;
@Repository
public interface DocumentRepository extends JpaRepository <Document,Long>{

}
