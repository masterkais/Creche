package com.ecmconsulting.creche.controller;

import com.ecmconsulting.creche.entity.Utilisateur;
import com.ecmconsulting.creche.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UtilisateurController {
    @Autowired
    UtilisateurService utilisateurService;

    @GetMapping("/utilisateurs")
    public List<Utilisateur> getAllUtilisateurs(){
        List<Utilisateur> list=utilisateurService.getAllUtilisateur();
        return list;
    }

    @PostMapping("")
    @ResponseBody
    public Utilisateur AjouterUtilisateur(@RequestBody Utilisateur u){
        return utilisateurService.AjouterUtilisateur(u);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteUtilisateur(@PathVariable("id")long idutilisateur){
        utilisateurService.DeleteUtilisateur(idutilisateur);
    }






}
