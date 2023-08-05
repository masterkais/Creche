package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Facture_repas;

import java.util.List;

public interface Facture_repasService {

    Facture_repas createFactureRepas(Facture_repas factureRepas);

    Facture_repas getFactureRepasById(Long idFacR);
    List<Facture_repas> getAllFactureRepas();

    Facture_repas updateFactureRepas(Long id, Facture_repas factureRepas);

    boolean deleteFactureRepas(Long idFacR);


}
