package com.ecmconsulting.creche.controller;

import com.ecmconsulting.creche.entity.Ligne_commande_repas;
import com.ecmconsulting.creche.services.Commande_repasService;
import com.ecmconsulting.creche.services.Ligne_commande_repasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ligne_commande_repas")
public class Ligne_commande_repasController {
    @Autowired
    Ligne_commande_repasService ligneCommandeRepasService;

    public Ligne_commande_repasController(Ligne_commande_repasService ligneCommandeRepasService) {
        this.ligneCommandeRepasService = ligneCommandeRepasService;
    }

    @PostMapping
    public ResponseEntity<Ligne_commande_repas> createLigneCommandeRepas(@RequestBody Ligne_commande_repas ligneCommandeRepas) {
        Ligne_commande_repas createdLigneCommandeRepas = ligneCommandeRepasService.createLigneCommandeRepas(ligneCommandeRepas);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdLigneCommandeRepas);
    }

    @GetMapping("/{idLCR}")
    public ResponseEntity<Ligne_commande_repas> getLigneCommandeRepasById(@PathVariable Long idLCR) {
        Ligne_commande_repas ligneCommandeRepas = ligneCommandeRepasService.getLigneCommandeRepasById(idLCR);
        if (ligneCommandeRepas != null) {
            return ResponseEntity.ok(ligneCommandeRepas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping
    public ResponseEntity<List<Ligne_commande_repas>> getAllLignesCommandeRepas() {
        List<Ligne_commande_repas> lignesCommandeRepas = ligneCommandeRepasService.getAllLignesCommandeRepas();
        return ResponseEntity.ok(lignesCommandeRepas);
    }

    @PutMapping("/{idLCR}")
    public ResponseEntity<Ligne_commande_repas> updateLigneCommandeRepas(@PathVariable Long idLCR, @RequestBody Ligne_commande_repas ligneCommandeRepas) {
        Ligne_commande_repas updatedLigneCommandeRepas = ligneCommandeRepasService.updateLigneCommandeRepas(idLCR, ligneCommandeRepas);
        if (updatedLigneCommandeRepas != null) {
            return ResponseEntity.ok(updatedLigneCommandeRepas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{idLCR}")
    public ResponseEntity<Void> deleteLigneCommandeRepas(@PathVariable Long idLCR) {
        boolean deleted = ligneCommandeRepasService.deleteLigneCommandeRepas(idLCR);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }






}
