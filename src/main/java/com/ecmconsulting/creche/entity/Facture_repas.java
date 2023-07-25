package com.ecmconsulting.creche.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Facture_repas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Facture_repas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private long idFacR;
    private String description;
    private Date date;
    private int etat;

    @OneToOne
    private Commande_repas Commande_repas;
}
