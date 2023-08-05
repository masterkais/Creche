package com.ecmconsulting.creche.controller;

import com.ecmconsulting.creche.entity.Facture_repas;
import com.ecmconsulting.creche.services.Commande_repasService;
import com.ecmconsulting.creche.services.Facture_repasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facture_repas")
public class Facture_repasController {
    @Autowired
    Facture_repasService factureRepasService;

    public Facture_repasController(Facture_repasService factureRepasService) {
        this.factureRepasService = factureRepasService;
    }

    @PostMapping
    public ResponseEntity<Facture_repas> createFactureRepas(@RequestBody Facture_repas factureRepas) {
        Facture_repas createdFactureRepas = factureRepasService.createFactureRepas(factureRepas);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFactureRepas);
    }


    @GetMapping("/{idFacR}")
    public ResponseEntity<Facture_repas> getFactureRepasById(@PathVariable Long idFacR) {
        Facture_repas factureRepas = factureRepasService.getFactureRepasById(idFacR);
        if (factureRepas != null) {
            return ResponseEntity.ok(factureRepas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Facture_repas>> getAllFactureRepas() {
        List<Facture_repas> facturesRepas = factureRepasService.getAllFactureRepas();
        return ResponseEntity.ok(facturesRepas);
    }

    @PutMapping("/{idFacR}")
    public ResponseEntity<Facture_repas> updateFactureRepas(@PathVariable Long idFacR, @RequestBody Facture_repas factureRepas) {
        Facture_repas updatedFactureRepas = factureRepasService.updateFactureRepas(idFacR, factureRepas);
        if (updatedFactureRepas != null) {
            return ResponseEntity.ok(updatedFactureRepas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{idFacR}")
    public ResponseEntity<Void> deleteFactureRepas(@PathVariable Long idFacR) {
        boolean deleted = factureRepasService.deleteFactureRepas(idFacR);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }















}
