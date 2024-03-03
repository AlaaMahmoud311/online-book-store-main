package com.demo.onlinebookstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.onlinebookstore.entity.Role;

public interface RoleRepository extends JpaRepository <Role, Integer> {
    
    public Optional<Role> findByName(String name);
}

