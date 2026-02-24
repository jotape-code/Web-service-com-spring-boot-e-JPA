package com.joao.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
