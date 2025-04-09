package com.practica1.crudusuario.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practica1.crudusuario.entidades.User;

@Repository
public interface UserRepositorio extends JpaRepository <User, Long>{
    
}
