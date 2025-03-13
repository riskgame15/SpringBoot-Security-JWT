package com.springbootsecurityjwt.controller;


import com.springbootsecurityjwt.model.Product;
import com.springbootsecurityjwt.service.product.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<?> getProduct() {
        List<Product> products = productService.findAll();
//        return new ResponseEntity<>(products, HttpStatus.OK);
        return ResponseEntity.ok(products);
    }
    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody Product product) {
        Product newProduct = productService.save(product);
        return ResponseEntity.ok(newProduct);
    }
}
