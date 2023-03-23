package org.ironhack.bootcamp.jpt13.school.repositories;

import org.ironhack.bootcamp.jpt13.school.models.Category;
import org.ironhack.bootcamp.jpt13.school.models.Department;
import org.ironhack.bootcamp.jpt13.school.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryAndDepartment(Category category, Department department);

    List<Product> findByDepartment(Department department);

    List<Product> findByDateCreatedLessThan(Date date);
    List<Product> findByDateCreatedBetween(Date startDate, Date endDate);

}
