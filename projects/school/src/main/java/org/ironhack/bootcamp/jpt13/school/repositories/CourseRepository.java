package org.ironhack.bootcamp.jpt13.school.repositories;

import org.ironhack.bootcamp.jpt13.school.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {

    Optional<Course> findByCourseName(String courseName);
}
