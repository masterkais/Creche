package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    List<Utilisateur> getAllUtilisateurs();

    Utilisateur getUtilisateurById(Long idutilisateur);

    Utilisateur createUtilisateur(Utilisateur utilisateur);

    Utilisateur updateUtilisateur(Long idutilisateur, Utilisateur utilisateur);

    void deleteUtilisateur(Long idutilisateur);


}
