package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Suivi_enfant;


import java.util.List;

public interface Suivi_enfantService {
    Suivi_enfant AjouterSuivi(Suivi_enfant S);
    void DeleteSuivi(Suivi_enfant S);
    void DeleteSuivi(Long idSuiv);

    List<Suivi_enfant> getALLSuivie();
    Suivi_enfant UpdateSuivi(Suivi_enfant S);
}
