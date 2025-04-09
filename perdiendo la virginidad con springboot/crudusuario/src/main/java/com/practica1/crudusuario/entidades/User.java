package com.practica1.crudusuario.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity


@AllArgsConstructor

@NoArgsConstructor // NECESARIO para que Hibernate pueda crear la entidad

@Getter

@Setter             // Para evitar escribir los getters/setters a mano

@Table(name = "User")

public class User {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long userId;

    @Column(name = "name", unique = false,nullable = false)

    private String userName;    


    @Column(name = "lastName", unique = false,nullable = false)

    private String userLastName;
    

    @Column(name = "email_address", nullable = false, unique = true)
   
    private String userEmail;
    
    @Column(name = "age", nullable = false)

    private int userAge;
    
    

}
