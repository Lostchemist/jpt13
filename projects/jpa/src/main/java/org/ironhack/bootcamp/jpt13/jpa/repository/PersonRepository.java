package org.ironhack.bootcamp.jpt13.jpa.repository;

import org.ironhack.bootcamp.jpt13.jpa.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
