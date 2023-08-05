package com.ecmconsulting.creche.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Suivi_enfant")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Suivi_enfant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private Long idSuiv;
    private Date pointageArrive;
    private Date pointageDepart;
    private int repas;
    @ManyToOne
    private Enfant Enfant ;
    @ManyToOne
    private Historique Historique ;


}
