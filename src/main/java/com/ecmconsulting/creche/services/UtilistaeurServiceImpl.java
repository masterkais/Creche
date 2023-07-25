package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Utilisateur;
import com.ecmconsulting.creche.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilistaeurServiceImpl implements UtilisateurService {

    @Autowired
    UtilisateurRepository RepUtilisateur;
    @Override
    public Utilisateur AjouterUtilisateur(Utilisateur u) {
        RepUtilisateur.save(u);
        return u;
    }

    @Override
    public void DeleteUtilisateur(Utilisateur u) {
        RepUtilisateur.delete(u);

    }

    @Override
    public void DeleteUtilisateur(Long idutilisateur) {
        RepUtilisateur.deleteById(idutilisateur);

    }


    @Override
    public List<Utilisateur> getAllUtilisateur() {
        return RepUtilisateur.findAll();
    }


}
