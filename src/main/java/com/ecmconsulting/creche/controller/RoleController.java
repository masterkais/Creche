package com.ecmconsulting.creche.controller;

import com.ecmconsulting.creche.entity.Role;
import com.ecmconsulting.creche.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    @Autowired
    RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }
    @PostMapping
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        Role createdRole = roleService.createRole(role);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRole);
    }

    @GetMapping("/{idR}")
    public ResponseEntity<Role> getRoleById(@PathVariable Long idR) {
        Role role = roleService.getRoleById(idR);
        if (role != null) {
            return ResponseEntity.ok(role);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Role>> getAllRoles() {
        List<Role> roles = roleService.getAllRoles();
        return ResponseEntity.ok(roles);
    }

    @PutMapping("/{idR}")
    public ResponseEntity<Role> updateRole(@PathVariable Long idR, @RequestBody Role role) {
        Role updatedRole = roleService.updateRole(idR, role);
        if (updatedRole != null) {
            return ResponseEntity.ok(updatedRole);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{idR}")
    public ResponseEntity<Void> deleteRole(@PathVariable Long idR) {
        boolean deleted = roleService.deleteRole(idR);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }













}
