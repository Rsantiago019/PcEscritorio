package com.practica1.crudusuario.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica1.crudusuario.entidades.User;
import com.practica1.crudusuario.repositorio.UserRepositorio;

@Service  // Marca esta clase como un servicio para que Spring la gestione
public class UserService {

    @Autowired
    private UserRepositorio userRepository;

    // Guardar o actualizar un usuario
    public void saveOrUpdate(User user) {
        userRepository.save(user);  // Si el user tiene ID, actualiza; si no, crea
    }

    // Buscar un usuario por su ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Eliminar un usuario por su ID
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
