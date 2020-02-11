package com.neha.mylogin.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.neha.mylogin.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
