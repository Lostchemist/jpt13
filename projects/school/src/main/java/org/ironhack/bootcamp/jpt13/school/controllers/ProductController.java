package org.ironhack.bootcamp.jpt13.school.controllers;

import org.ironhack.bootcamp.jpt13.school.models.Category;
import org.ironhack.bootcamp.jpt13.school.models.Department;
import org.ironhack.bootcamp.jpt13.school.models.Product;
import org.ironhack.bootcamp.jpt13.school.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@RestController
public class ProductController implements ProductControllerInterface {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Product getProductById(@PathVariable(name = "id") long productId) {
        Optional<Product> productMaybe = productRepository.findById(productId);
        if (!productMaybe.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Could not found product with id " + productId);
        }
        return productMaybe.get();
    }

    @Override
    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getProductsByCategoryAndDepartment(
            @RequestParam(name = "category", required = false) Optional<String> category,
            @RequestParam(name = "department", required = true) String department) {

        Department dep = Department.valueOf(department);
        if (category.isPresent()) {
            Category cat = Category.valueOf(category.get());
            return productRepository.findByCategoryAndDepartment(cat, dep);
        } else {
            return productRepository.findByDepartment(dep);
        }

    }

    @GetMapping("/products/byDate")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getProductsByDate(
            @RequestParam(name = "dateCreated")
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            Date dateCreated
    ) {

        return productRepository.findByDateCreatedLessThan(dateCreated);
    }

    @GetMapping("/products/betweenDates")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getProductsByDate(
            @RequestParam(name = "startDate")
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            Date startDate,
            @RequestParam(name = "endDate")
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            Date endDate
            ) {

        System.out.println("This is a test");
        return productRepository.findByDateCreatedBetween(startDate, endDate);
    }
}
