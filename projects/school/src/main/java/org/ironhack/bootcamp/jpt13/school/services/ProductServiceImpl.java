package org.ironhack.bootcamp.jpt13.school.services;

import org.ironhack.bootcamp.jpt13.school.models.Product;
import org.ironhack.bootcamp.jpt13.school.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void updateProduct(Long id, Product product) {
        if (product.getId() != id) {
            return;
        }
        Optional<Product> productOptional = productRepository.findById(id);
        if (!productOptional.isPresent()) {
            return;
        }

        // validate object exists
        productRepository.save(product);
    }
}
