package com.demo.onlinebookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.onlinebookstore.DTO.UserDTO;
import com.demo.onlinebookstore.entity.UserEntity;

import com.demo.onlinebookstore.exception.UserNotFoundException;
import com.demo.onlinebookstore.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    
    
    private final UserRepository userRepository;

    public UserEntity getUserById(Integer userId){
        return userRepository.findById(userId).orElseThrow(()-> new UserNotFoundException("User Not Found with that id :"+ userId));
    }

    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    public UserEntity getUserByEmail(String email){
        return userRepository.findUserByEmail(email).orElse(null);
    }

    public boolean existsByEmail(String email){
        return userRepository.existsByEmail(email);
    }

    public UserEntity save(UserEntity user){
        return userRepository.save(user);
    }

}
