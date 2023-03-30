package org.ironhack.bootcamp.jpt13.school.services;

import org.ironhack.bootcamp.jpt13.school.models.Product;
import org.ironhack.bootcamp.jpt13.school.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void updateProduct(Long id, Product product) {
        if (product.getId() != id) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The id in the path doesn't match the id in the payload");
        }
        Optional<Product> productOptional = productRepository.findById(id);

        if (productOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "cannot find any product with id " + id);
        }
//        Product productOptional = productRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "cannot find any product with id " + id));

        // validate object exists
        productRepository.save(product);
    }

    @Override
    public Product create(Product product) {
        if (product.getId() != null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The id in the path doesn't match the id in the payload");
        }

        // validate object exists
        return productRepository.save(product);
    }
}
