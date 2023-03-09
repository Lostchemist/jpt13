package org.ironhack.bootcamp.jpt13.jpa;

import org.ironhack.bootcamp.jpt13.jpa.models.ComputerSection;
import org.ironhack.bootcamp.jpt13.jpa.repository.ComputerSectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	private ComputerSectionRepository computerSectionRepository;



	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ComputerSection section  = new ComputerSection(14);
		section.setId("cs101-A");
		section.setCapacity(20);
		section.setEnrolled(24);
		section.setInstructor("John Doe");
		section.setRoomNum(1);
		section.setCourseCode("cs101");

		computerSectionRepository.save(section);

	}
}
