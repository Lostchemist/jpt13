package org.ironhack.bootcamp.jpt13.jpa.repository;

import org.ironhack.bootcamp.jpt13.jpa.models.ComputerSection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerSectionRepository extends JpaRepository<ComputerSection, String> {
}
