package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Role;
import com.ecmconsulting.creche.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role getRoleById(Long idR) {
        Optional<Role> optionalRole = roleRepository.findById(idR);
        return optionalRole.orElse(null);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role updateRole(Long idR, Role role) {
        Role existingRole = getRoleById(idR);
        if (existingRole != null) {
            existingRole.setPrivileges(role.getPrivileges());
            return roleRepository.save(existingRole);
        }
        return null;
    }

    @Override
    public boolean deleteRole(Long idR) {
        Role existingRole = getRoleById(idR);
        if (existingRole != null) {
            roleRepository.delete(existingRole);
            return true;
        }
        return false;
    }

}
