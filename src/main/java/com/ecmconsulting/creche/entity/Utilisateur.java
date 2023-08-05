package com.ecmconsulting.creche.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Utilisateur")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long idutilisateur;
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private String telephone;
    private String fax;
    private String couriel;
    private byte image;
    private int active;
    private String Login;
    private String Password;
    private int type;



    @ManyToOne
    private Role Role;
    @ManyToMany
    private List<Message> Message;
    @OneToMany(mappedBy = "Utilisateur", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Abonnement> Abonnement;

    @OneToMany(mappedBy = "Utilisateur", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Enfant> Enfant;







}
