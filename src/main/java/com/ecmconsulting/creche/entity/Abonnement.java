package com.ecmconsulting.creche.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Abonnement")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private long idAbo;
    private Date date_debut;
    private Date date_fin;
    private  Long id_enfant;

    @Enumerated(EnumType.STRING)
    private Type_abonnement type;

    @OneToOne
    private Facture Facture;

    @ManyToOne
    private Utilisateur Utilisateur;
}
