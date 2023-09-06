package com.ecmconsulting.creche.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Enfant")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Enfant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long idenfant;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adresse;


    @OneToMany(mappedBy = "Enfant", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Suivi_enfant> Suivi_enfant;

    @OneToMany(mappedBy = "Enfant", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Document> Document;

    @ManyToOne
    private Utilisateur Utilisateur;


}
