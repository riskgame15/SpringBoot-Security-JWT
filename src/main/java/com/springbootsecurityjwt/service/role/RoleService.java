package com.springbootsecurityjwt.service.role;


import com.springbootsecurityjwt.model.Role;
import com.springbootsecurityjwt.repo.IRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepo roleRepo;

    @Override
    public List<Role> findAll() {
        return roleRepo.findAll();
    }

    @Override
    public Role findById(Long id) {
        return null;
    }

    @Override
    public Role save(Role role) {
        return null;
    }

    @Override
    public void delete(Role role) {

    }
}
