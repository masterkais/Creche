package com.ecmconsulting.creche.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Historique")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Historique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private Long idHist;
    private byte fichier;
    private String type;

    @OneToMany(mappedBy = "Historique", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Suivi_enfant> Suivi_enfant;

}
