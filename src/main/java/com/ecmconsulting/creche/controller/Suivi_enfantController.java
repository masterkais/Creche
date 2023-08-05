package com.ecmconsulting.creche.controller;

import com.ecmconsulting.creche.entity.Suivi_enfant;
import com.ecmconsulting.creche.services.Suivi_enfantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suivi")
public class Suivi_enfantController {
    @Autowired
    Suivi_enfantService SuivServ;
    @GetMapping("/suivis")
    public List<Suivi_enfant> getAllSuivi(){
        List<Suivi_enfant> liste=SuivServ.getALLSuivie();
        return liste;
    }

    @PostMapping()
    @ResponseBody
    public Suivi_enfant AjouterSuivi(@RequestBody Suivi_enfant S){
        return SuivServ.AjouterSuivi(S);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteSuivi(@PathVariable("id")Long idSuiv){
        SuivServ.DeleteSuivi(idSuiv);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Suivi_enfant UpdateSuivi(@RequestBody Suivi_enfant S) {
        return SuivServ.UpdateSuivi(S);
    }
}
