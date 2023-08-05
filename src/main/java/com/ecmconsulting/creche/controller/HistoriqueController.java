package com.ecmconsulting.creche.controller;

import com.ecmconsulting.creche.entity.Historique;
import com.ecmconsulting.creche.services.HistoriqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historique")
public class HistoriqueController {
    @Autowired
    HistoriqueService HistServ;
    @GetMapping("/historiques")
    public List<Historique> getAllHistorique(){
        List<Historique> liste=HistServ.getAllHistorique();
        return liste;
    }

    @PostMapping()
    @ResponseBody
    public Historique AjouterHistorique(@RequestBody Historique H){
        return HistServ.AjouterHistorique(H);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteHistorique(@PathVariable("id")Long idHist){
        HistServ.DeleteHistorique(idHist);
    }
    @PutMapping("/{id}")
    @ResponseBody
    public Historique UpdateHistorique(@RequestBody Historique H) {
        return HistServ.UpdateHistorique(H);
    }
}
