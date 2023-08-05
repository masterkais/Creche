package com.ecmconsulting.creche.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Facture")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private long idFact;
    private String description;
    private Date date;
    private int etat;
    private double total;

    @OneToOne
    private Abonnement abonnement;
}
