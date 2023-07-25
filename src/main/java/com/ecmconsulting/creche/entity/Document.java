package com.ecmconsulting.creche.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Document")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Document implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private Long idDoc;
    private String description;
    private Date date;
    private byte contenu;

    @ManyToOne
    private Enfant Enfant;
}
