package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Utilisateur;
import com.ecmconsulting.creche.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilistaeurServiceImpl implements UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Override
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur getUtilisateurById(Long idutilisateur) {
        return utilisateurRepository.findById(idutilisateur).orElse(null);
    }

    @Override
    public Utilisateur createUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur updateUtilisateur(Long idutilisateur, Utilisateur utilisateur) {

        if (!utilisateurRepository.existsById(idutilisateur)) {
            return null;
        }
        utilisateur.setIdutilisateur(idutilisateur);
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void deleteUtilisateur(Long idutilisateur) {
        utilisateurRepository.deleteById(idutilisateur);
    }


}