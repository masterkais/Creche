package com.ecmconsulting.creche.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Commande_repas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Commande_repas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private long idComRep;
    private Double total;
    private Date date;
    private char etat;

    @OneToMany(mappedBy = "Commande_repas", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Ligne_commande_repas> Ligne_commande_repas;


    @OneToOne
    private Facture_repas Facture_repas;

}
