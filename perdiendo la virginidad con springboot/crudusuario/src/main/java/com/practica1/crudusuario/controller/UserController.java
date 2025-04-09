package com.practica1.crudusuario.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica1.crudusuario.Service.UserService;
import com.practica1.crudusuario.entidades.User;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;


    @RestController
    @CrossOrigin(origins = "*") // permite recibir desde HTML local
    @RequestMapping(path = "api/v1/users") //Define el prefijo común de la URL para todas las rutas del controlador.

    public class UserController { //  va a manejar todo lo relacionado con los usuarios (crear, buscar, eliminar...).
    @Autowired
    private UserService userService;
    
    


    @PostMapping("/registrar")
    public String registrarUsuario(@ModelAttribute User user) {
        System.out.println(" LLEGÓ LA PETICIÓN: " + user);
        userService.saveOrUpdate(user);
        return "redirect:/registro-exitoso.html";
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@ModelAttribute User user) {
    User savedUser = new User(null, null, null, null, 0);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
}

    @GetMapping("/{userId}") //Este método se activa con una petición GET
    public Optional<User> getById(@PathVariable("userId") Long userId ) { //@PathVariable("userId") indica que el valor de la URL (/api/v1/users/5) se pasa como parámetro (userId = 5).
       return  userService.getUserById(userId); //Llama al servicio para obtener el usuario con ese ID.
    } // El resultado es un Optional<User>, por si el usuario no existe (así evitás errores tipo null).

    @DeleteMapping("/{userId}") //  Este método se activa con una petición DELETE a /api/v1/users/{id}.
    //Se usa para eliminar un usuario según su ID.
    public void delete (@PathVariable("userId") Long userId)
    {
        userService.delete(userId); //  Llama al servicio para eliminar al usuario con ese ID.
    }
    
    
}
