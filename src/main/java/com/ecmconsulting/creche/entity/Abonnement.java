package com.ecmconsulting.creche.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Date dateDebut;
    private Date dateFin;
    private  Long id_enfant;

    @Enumerated(EnumType.STRING)
    private Type_abonnement type;

    @OneToOne
    private Facture Facture;

    @ManyToOne
    private Utilisateur Utilisateur;
}
