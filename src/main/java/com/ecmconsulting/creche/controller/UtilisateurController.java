package com.ecmconsulting.creche.controller;

import com.ecmconsulting.creche.entity.Utilisateur;
import com.ecmconsulting.creche.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurService.getAllUtilisateurs();
    }

    @GetMapping("/{idutilisateur}")
    public Utilisateur getUtilisateurById(@PathVariable Long idutilisateur) {
        return utilisateurService.getUtilisateurById(idutilisateur);
    }

    @PostMapping
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.createUtilisateur(utilisateur);
    }

    @PutMapping("/{idutilisateur}")
    public Utilisateur updateUtilisateur(@PathVariable Long idutilisateur, @RequestBody Utilisateur utilisateur) {
        return utilisateurService.updateUtilisateur(idutilisateur, utilisateur);
    }

    @DeleteMapping("/{idutilisateur}")
    public void deleteUtilisateur(@PathVariable Long idutilisateur) {
        utilisateurService.deleteUtilisateur(idutilisateur);
    }
}
