package com.ecmconsulting.creche.controller;
import com.ecmconsulting.creche.entity.Abonnement;
import com.ecmconsulting.creche.entity.Utilisateur;
import com.ecmconsulting.creche.services.AbonnementService;
import com.ecmconsulting.creche.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/abonnements")
@CrossOrigin(origins = "http://localhost:4200")
public class AbonnementController {
    private final AbonnementService abonnementService;

    @Autowired
    public AbonnementController(AbonnementService abonnementService) {
        this.abonnementService = abonnementService;
    }


    @PostMapping
    public ResponseEntity<Abonnement> créerAbonnement(@RequestBody Abonnement abonnement) {
        Abonnement nouvelAbonnement = abonnementService.créerAbonnement(abonnement);
        return new ResponseEntity<>(nouvelAbonnement, HttpStatus.CREATED);
    }


    @GetMapping("/{idAbo}")
    public ResponseEntity<Abonnement> obtenirAbonnementParId(@PathVariable Long idAbo) {
        Abonnement abonnement = abonnementService.obtenirAbonnementParId(idAbo);
        if (abonnement != null) {
            return new ResponseEntity<>(abonnement, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping
    public ResponseEntity<List<Abonnement>> obtenirTousLesAbonnements() {
        List<Abonnement> abonnements = abonnementService.obtenirTousLesAbonnements();
        return new ResponseEntity<>(abonnements, HttpStatus.OK);
    }

    @PutMapping("/{idAbo}")
    public ResponseEntity<Abonnement> mettreAJourAbonnement(@PathVariable("idAbo") Long idAbo, @RequestBody Abonnement abonnement) {
        Abonnement abonnementExistant = abonnementService.obtenirAbonnementParId(idAbo);
        if (abonnementExistant != null) {
            abonnementExistant.setDateDebut(abonnement.getDateDebut());
            abonnementExistant.setDateFin(abonnement.getDateFin());
            abonnementExistant.setType(abonnement.getType());


            abonnementService.mettreAJourAbonnement(abonnementExistant);
            return new ResponseEntity<>(abonnementExistant, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }




    @DeleteMapping("/{idAbo}")
    public ResponseEntity<HttpStatus> supprimerAbonnementParId(@PathVariable Long idAbo) {
        Abonnement abonnement = abonnementService.obtenirAbonnementParId(idAbo);
        if (abonnement != null) {
            abonnementService.supprimerAbonnementParId(idAbo);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/actifs")
    public ResponseEntity<List<Abonnement>> obtenirAbonnementsActifs() {
        List<Abonnement> abonnements = abonnementService.trouverAbonnementsActifs(new Date());
        return new ResponseEntity<>(abonnements, HttpStatus.OK);
    }

    @GetMapping("/expirés")
    public ResponseEntity<List<Abonnement>> obtenirAbonnementsExpirés() {
        List<Abonnement> abonnements = abonnementService.trouverAbonnementsExpirés(new Date());
        return new ResponseEntity<>(abonnements, HttpStatus.OK);
    }

}