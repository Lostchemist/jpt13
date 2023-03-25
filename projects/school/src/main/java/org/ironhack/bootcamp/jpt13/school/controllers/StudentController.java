package org.ironhack.bootcamp.jpt13.school.controllers;

import jakarta.validation.Valid;
import org.ironhack.bootcamp.jpt13.school.models.Student;
import org.ironhack.bootcamp.jpt13.school.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController implements StudentControllerInterface {
    @Autowired
    private StudentService studentService;

    @Override
    @GetMapping("/students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> list() {
        return studentService.list();
    }

    @Override
    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public Student create(@RequestBody @Valid Student student) {
        return studentService.create(student);
    }

    @Override
    @PutMapping("/students/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody Student student) {
        studentService.update(id, student);
    }

    @Override
    @DeleteMapping("/students/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        studentService.delete(id);
    }

}
