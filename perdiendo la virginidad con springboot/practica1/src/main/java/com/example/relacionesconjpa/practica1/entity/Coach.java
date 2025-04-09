package com.example.relacionesconjpa.practica1.entity;

import jakarta.annotation.sql.DataSourceDefinition;

@DataSourceDefinition
@AllArgsConstructor
@NoArgsContructor

public class Coach {
    private long id;
    private String name;
    private String lastname;
    private String nationality;


}
