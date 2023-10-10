package com.example.studentmd4.service.impl;


import com.example.studentmd4.model.Student;
import com.example.studentmd4.repository.StudentRepository;
import com.example.studentmd4.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService implements IStudentService {
    @Autowired
   private StudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void save(Student student) {
studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
studentRepository.deleteById(id);
    }


    @Override
    public List<Student> SearchByName(String name) {
        return studentRepository.findByNameContaining(name);
    }
}
