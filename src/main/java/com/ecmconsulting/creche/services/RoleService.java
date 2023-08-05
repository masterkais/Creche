package com.ecmconsulting.creche.services;

import com.ecmconsulting.creche.entity.Role;

import java.util.List;

public interface RoleService {
    Role createRole(Role role);
    Role getRoleById(Long idR);
    List<Role> getAllRoles();
    Role updateRole(Long idR, Role role);
    boolean deleteRole(Long idR);
}
