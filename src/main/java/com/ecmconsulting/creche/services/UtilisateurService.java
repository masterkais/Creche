package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    Utilisateur AjouterUtilisateur(Utilisateur u);
    void DeleteUtilisateur(Utilisateur u);
    void DeleteUtilisateur(Long idutilisateur);

    List<Utilisateur> getAllUtilisateur();


}
