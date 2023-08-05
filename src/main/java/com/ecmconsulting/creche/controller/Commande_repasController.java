package com.ecmconsulting.creche.controller;

import com.ecmconsulting.creche.entity.Commande_repas;
import com.ecmconsulting.creche.entity.Ligne_commande_repas;
import com.ecmconsulting.creche.services.Commande_repasService;
import com.ecmconsulting.creche.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commande_repas")
public class Commande_repasController {
    @Autowired
    Commande_repasService commandeRepasService;

    public Commande_repasController(Commande_repasService commandeRepasService) {
        this.commandeRepasService = commandeRepasService;
    }

    @PostMapping
    public ResponseEntity<Commande_repas> createCommandeRepas(@RequestBody Commande_repas commandeRepas) {
        Commande_repas createdCommandeRepas = commandeRepasService.createCommandeRepas(commandeRepas);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCommandeRepas);
    }

    @GetMapping("/{idComRep}")
    public ResponseEntity<Commande_repas> getCommandeRepasById(@PathVariable Long idComRep) {
        Commande_repas commandeRepas = commandeRepasService.getCommandeRepasById(idComRep);
        if (commandeRepas != null) {
            return ResponseEntity.ok(commandeRepas);
        } else {
            return ResponseEntity.notFound().build();
        }

    }
    @GetMapping
    public ResponseEntity<List<Commande_repas>> getAllCommandeRepas() {
        List<Commande_repas> commandesRepas = commandeRepasService.getAllCommandeRepas();
        return ResponseEntity.ok(commandesRepas);
    }

    @PutMapping("/{idComRep}")
    public ResponseEntity<Commande_repas> updateCommandeRepas(@PathVariable Long idComRep, @RequestBody Commande_repas commandeRepas) {
        Commande_repas updatedCommandeRepas = commandeRepasService.updateCommandeRepas(idComRep, commandeRepas);
        if (updatedCommandeRepas != null) {
            return ResponseEntity.ok(updatedCommandeRepas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{idComRep}")
    public ResponseEntity<Void> deleteCommandeRepas(@PathVariable Long idComRep) {
        boolean deleted = commandeRepasService.deleteCommandeRepas(idComRep);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }











}
