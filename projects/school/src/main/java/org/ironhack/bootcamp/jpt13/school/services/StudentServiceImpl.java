package org.ironhack.bootcamp.jpt13.school.services;

import org.ironhack.bootcamp.jpt13.school.models.Student;
import org.ironhack.bootcamp.jpt13.school.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> list() {
        return studentRepository.findAll();
    }

    @Override
    public Student create(Student student) {
        if (student.getId() != null) {
            new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "an object with id" + student.getId() + " already exists");
        }
        return studentRepository.save(student);
    }

    @Override
    public void update(Long id, Student student) {
        if (student.getId() != id) {
            return;
        }
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (!studentOptional.isPresent()) {
            return;
        }

        studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if (!studentOptional.isPresent()) {
            return;
        }
        studentRepository.delete(studentOptional.get());
    }


}
