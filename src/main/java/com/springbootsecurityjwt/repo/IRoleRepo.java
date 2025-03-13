package com.springbootsecurityjwt.repo;

import com.springbootsecurityjwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepo extends JpaRepository<Role, Long> {
}
