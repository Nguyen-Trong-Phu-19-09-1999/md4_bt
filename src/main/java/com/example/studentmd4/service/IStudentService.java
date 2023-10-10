package com.example.studentmd4.service;


import com.example.studentmd4.model.Student;

import java.util.List;

public interface IStudentService extends IGenerateService<Student>{
    List<Student> SearchByName(String name);
}
