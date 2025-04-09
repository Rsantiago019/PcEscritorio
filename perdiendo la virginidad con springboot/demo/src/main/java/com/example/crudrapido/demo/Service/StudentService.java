package com.example.crudrapido.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudrapido.demo.entity.Student;
import com.example.crudrapido.demo.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    
    // Listar todos los estudiantes 
    public List<Student> getStudents()
    {
        return studentRepository.findAll();


 
   }

   // Buscar un Estudiante por una Id determinada   
   public Optional<Student> getStudentById(Long id) {
    return studentRepository.findById(id);
}
// Contar estudiantes por ID




public void saveOrUpdate (Student student)
{
    studentRepository.save(student);

}
// borrar por ID 
public void delete (Long Id)
{
    studentRepository.deleteById(Id);
    
}


}

