package com.ecmconsulting.creche.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Ligne_commande_repas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ligne_commande_repas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private long idLCR;
    private int quantite;
    private double prix;
    private String description;

    @ManyToOne
    private Commande_repas Commande_repas;
}
