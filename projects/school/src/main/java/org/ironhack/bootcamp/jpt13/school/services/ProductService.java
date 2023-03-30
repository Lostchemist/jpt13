package org.ironhack.bootcamp.jpt13.school.services;

import org.ironhack.bootcamp.jpt13.school.models.Product;

public interface ProductService {

    void updateProduct(Long id, Product product);

    Product create(Product product);
}
