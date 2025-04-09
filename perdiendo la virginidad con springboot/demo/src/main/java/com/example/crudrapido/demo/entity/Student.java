package com.example.crudrapido.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tbl_student")




public class Student {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long studentId;

private String lastname;    
private String firstname;
@Column(name = "email_address", unique = true,nullable = false)
private String email;
}
