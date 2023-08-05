package com.ecmconsulting.creche.controller;

import com.ecmconsulting.creche.entity.Enfant;
import com.ecmconsulting.creche.services.EnfantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enfant")
public class EnfantController {
    @Autowired
    EnfantService EnfServ;

    @GetMapping("/enfants")
    public List<Enfant> getAllEnfant() {
        List<Enfant> liste = EnfServ.getAllEnfant();
        return liste;
    }

    @PostMapping()
    @ResponseBody
    public Enfant AjouterEnfant(@RequestBody Enfant E) {
        return EnfServ.AjouterEnfant(E);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteEnfant(@PathVariable("id") Long idEnfant) {
        EnfServ.DeleteEnfant(idEnfant);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Enfant UpdateEnfant(@RequestBody Enfant E) {
        return EnfServ.UpdateEnfant(E);
    }
}