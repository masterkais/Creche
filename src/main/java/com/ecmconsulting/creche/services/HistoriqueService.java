package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Historique;
import java.util.List;

public interface HistoriqueService {
    Historique AjouterHistorique(Historique H);
    void DeleteHistorique(Historique H);
    void DeleteHistorique(Long idHistorique);

    List<Historique> getAllHistorique();
    Historique UpdateHistorique(Historique H);
}
