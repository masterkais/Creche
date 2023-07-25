package com.ecmconsulting.creche.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Message")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private Long idMesg;
    private Date date;
    private String message_contenu;
    private String message_titre;


    @ManyToOne
    private Utilisateur Utilisateur;

}
