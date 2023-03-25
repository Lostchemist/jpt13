package org.ironhack.bootcamp.jpt13.school.controllers;

import org.ironhack.bootcamp.jpt13.school.models.Student;

import java.util.List;

public interface StudentControllerInterface {

    List<Student> list();

    Student create(Student student);

    void update(Long id, Student student);

    void delete(Long id);

}
