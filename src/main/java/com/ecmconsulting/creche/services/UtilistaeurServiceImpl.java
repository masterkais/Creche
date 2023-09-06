package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Utilisateur;
import com.ecmconsulting.creche.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Utilisateur updateUtilisateur(Long idutilisateur, Utilisateur utilisateur) {
        Optional<Utilisateur> utilisateurExistantOptional = RepUtilisateur.findById(idutilisateur);
        if (utilisateurExistantOptional.isPresent()) {
            Utilisateur utilisateurExistant = utilisateurExistantOptional.get();
            utilisateurExistant.setNom(utilisateur.getNom());
            utilisateurExistant.setPrenom(utilisateur.getPrenom());
            utilisateurExistant.setAdresse(utilisateur.getAdresse());
            utilisateurExistant.setVille(utilisateur.getVille());
            utilisateurExistant.setTelephone(utilisateur.getTelephone());
            utilisateurExistant.setFax(utilisateur.getFax());
            utilisateurExistant.setCouriel(utilisateur.getCouriel());
            utilisateurExistant.setActive(utilisateur.getActive());
            utilisateurExistant.setLogin(utilisateur.getLogin());
            utilisateurExistant.setPassword(utilisateur.getPassword());
            utilisateurExistant.setType(utilisateur.getType());

            return RepUtilisateur.save(utilisateurExistant);
        } else {
            return null;
        }
    }


}
