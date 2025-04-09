package com.repositorio;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio {
    
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
}
