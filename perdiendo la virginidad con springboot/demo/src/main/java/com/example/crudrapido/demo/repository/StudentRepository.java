package com.example.crudrapido.demo.repository;

import com.example.crudrapido.demo.entity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}

