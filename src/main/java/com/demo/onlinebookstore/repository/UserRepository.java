package com.demo.onlinebookstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.onlinebookstore.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    public Optional<UserEntity> findUserByEmail(String email);
    public boolean existsByEmail(String email);
}
