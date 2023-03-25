package org.ironhack.bootcamp.jpt13.school.repositories;

import org.ironhack.bootcamp.jpt13.school.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
