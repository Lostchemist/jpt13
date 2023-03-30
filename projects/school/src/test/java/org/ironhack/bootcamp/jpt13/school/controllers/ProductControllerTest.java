package org.ironhack.bootcamp.jpt13.school.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.ironhack.bootcamp.jpt13.school.models.Category;
import org.ironhack.bootcamp.jpt13.school.models.Department;
import org.ironhack.bootcamp.jpt13.school.models.Product;
import org.ironhack.bootcamp.jpt13.school.repositories.ProductRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class ProductControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private ProductRepository productRepository;

    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        // String name, BigDecimal price, Category category, Department department, Date dateCreated
        productRepository.save(new Product("Ring", new BigDecimal(100.3), Category.HANDMADE, Department.ART, new Date()));

    }

    @AfterEach
    void tearDown() {
        productRepository.deleteAll();
    }

    @Test
    void getProductById() throws Exception {
        MvcResult mvcResult =  mockMvc.perform(
                get("/products/{id}", 1)
        ).andExpect(status().isOk()).andReturn();

        Product p = mapper.readValue(mvcResult.getResponse().getContentAsString(), Product.class);
        assertEquals(p.getCategory(), Category.HANDMADE);
        assertEquals(p.getName(), "Ring");

    }

    @Test
    void getProductsByCategoryAndDepartment() {
    }

    @Test
    void addProduct() throws Exception {
        Product testPayload = new Product();
        testPayload.setId(1L);
        testPayload.setName("test product");
        testPayload.setCategory(Category.HANDMADE);
        testPayload.setDepartment(Department.ART);

        String body = mapper.writeValueAsString(testPayload);

        mockMvc.perform(MockMvcRequestBuilders.post("/products")
                .content(body)
                .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isBadRequest()).andReturn();
    }
}
