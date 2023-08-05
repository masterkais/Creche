package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Abonnement;
import com.ecmconsulting.creche.entity.Facture;
import com.ecmconsulting.creche.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactureServiceImpl implements FactureService {
    private final FactureRepository factureRepository;

    @Autowired
    public FactureServiceImpl(FactureRepository factureRepository) {
        this.factureRepository = factureRepository;
    }

    @Override
    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public Facture getFactureById(Long idFact) {
        return factureRepository.findById(idFact).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByAbonnement(Abonnement abonnement) {
        return factureRepository.findByAbonnement(abonnement);
    }

    @Override
    public Facture createFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public Facture updateFacture(Long idFact, Facture updatedFacture) {
        Facture existingFacture = factureRepository.findById(idFact).orElse(null);
        if (existingFacture != null) {
            existingFacture.setDate(updatedFacture.getDate());
            existingFacture.setTotal(updatedFacture.getTotal());
            existingFacture.setAbonnement(updatedFacture.getAbonnement());
            existingFacture.setDescription(updatedFacture.getDescription());
            existingFacture.setEtat(updatedFacture.getEtat());



            return factureRepository.save(existingFacture);
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteFacture(Long idFact) {
        factureRepository.deleteById(idFact);
        return false;
    }
    @Override
    public List<Facture> getFacturesByEtat(int etat) {
        return factureRepository.findByEtat(etat);
    }
    @Override
    public List<Facture> getAllUnpaidFactures() {
        return factureRepository.findByEtat(0);
    }
    @Override
    public double getTotalPaidAmount() {
        List<Facture> paidFactures = factureRepository.findByEtat(1);
        return paidFactures.stream().mapToDouble(Facture::getTotal).sum();
    }
}


