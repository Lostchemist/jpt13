package org.ironhack.bootcamp.jpt13.school.controllers;

import org.ironhack.bootcamp.jpt13.school.models.Course;
import org.ironhack.bootcamp.jpt13.school.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController implements CourseControllerInterface {
    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    @ResponseStatus(HttpStatus.OK)
    public List<Course> getCourses() {
        return courseService.listCourses();
    }
}
