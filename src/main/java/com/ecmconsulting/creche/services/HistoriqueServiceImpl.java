package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Historique;
import com.ecmconsulting.creche.repository.HistoriqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HistoriqueServiceImpl implements HistoriqueService {
    @Autowired
    HistoriqueRepository RepHist;
    @Override
    public Historique AjouterHistorique(Historique H) {
        RepHist.save(H);
        return H;
    }

    @Override
    public void DeleteHistorique(Historique H) {
        RepHist.delete(H);

    }

    @Override
    public void DeleteHistorique(Long idHistorique) {
        RepHist.deleteById(idHistorique);
    }
    @Override
    public List<Historique> getAllHistorique() {
        return RepHist.findAll();
    }

    @Override
    public Historique UpdateHistorique(Historique H) {
        RepHist.save(H);
        return H;
    }
}
