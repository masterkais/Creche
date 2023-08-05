package com.ecmconsulting.creche.controller;

import com.ecmconsulting.creche.entity.Facture;
import com.ecmconsulting.creche.services.FactureService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factures")
public class FactureController {

    private final FactureService factureService;

    public FactureController(FactureService factureService) {
        this.factureService = factureService;
    }

    @GetMapping
    public ResponseEntity<List<Facture>> getAllFactures() {
        List<Facture> factures = factureService.getAllFactures();
        return ResponseEntity.ok(factures);
    }

    @GetMapping("/{idFact}")
    public ResponseEntity<Facture> getFactureById(@PathVariable("idFact") long idFact) {
        Facture facture = factureService.getFactureById(idFact);
        if (facture != null) {
            return ResponseEntity.ok(facture);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping
    public ResponseEntity<Facture> createFacture(@RequestBody Facture facture) {
        Facture createdFacture = factureService.createFacture(facture);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdFacture);
    }


    @PutMapping("/{idFact}")
    public ResponseEntity<Facture> updateFacture(@PathVariable("idFact") long idFact, @RequestBody Facture facture) {
        Facture updatedFacture = factureService.updateFacture(idFact, facture);
        if (updatedFacture != null) {
            return ResponseEntity.ok(updatedFacture);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/{idFact}")
    public ResponseEntity<Void> deleteFacture(@PathVariable("idFact") long idFact) {
        boolean deleted = factureService.deleteFacture(idFact);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/etat/{etat}")
    public List<Facture> getFacturesByEtat(@PathVariable int etat) {
        return factureService.getFacturesByEtat(etat);
    }
    @GetMapping("/total-paid-amount")
    public Double getTotalPaidAmount() {
        return factureService.getTotalPaidAmount();
    }
    @GetMapping("/unpaid")
    public List<Facture> getAllUnpaidFactures() {
        return factureService.getAllUnpaidFactures();
    }
}
