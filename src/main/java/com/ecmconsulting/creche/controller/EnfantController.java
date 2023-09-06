package com.ecmconsulting.creche.controller;

import com.ecmconsulting.creche.entity.Enfant;
import com.ecmconsulting.creche.services.EnfantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enfants")
public class EnfantController {

    private final EnfantService enfantService;

    @Autowired
    public EnfantController(EnfantService enfantService) {
        this.enfantService = enfantService;
    }

    @GetMapping
    public List<Enfant> getAllEnfants() {
        return enfantService.getAllEnfants();
    }

    @GetMapping("/{idenfant}")
    public Enfant getEnfantById(@PathVariable Long idenfant) {
        return enfantService.getEnfantById(idenfant);
    }

    @PostMapping
    public Enfant createEnfant(@RequestBody Enfant enfant) {
        return enfantService.saveEnfant(enfant);
    }

    @PutMapping("/{idenfant}")
    public Enfant updateEnfant(@PathVariable Long idenfant, @RequestBody Enfant enfant) {
        return enfantService.updateEnfant(idenfant, enfant);
    }

    @DeleteMapping("/{idenfant}")
    public void deleteEnfant(@PathVariable Long idenfant) {
        enfantService.deleteEnfant(idenfant);
    }
}
