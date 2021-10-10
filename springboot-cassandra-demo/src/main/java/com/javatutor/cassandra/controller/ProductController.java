package com.javatutor.cassandra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatutor.cassandra.ResouceNotFoundException;
import com.javatutor.cassandra.model.Product;
import com.javatutor.cassandra.repo.ProductRepo;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductRepo productRepo;

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        productRepo.save(product);
        return product;

    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") Integer productId){
        Product product=productRepo.findById(productId).orElseThrow(
                () -> new ResouceNotFoundException("Product not found" + productId));
        return ResponseEntity.ok().body(product);
    }



    @GetMapping("/products")
    public List<Product> getProducts(){

        return productRepo.findAll();
    }

    @PutMapping("products/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable(value = "id") Integer productId,
                                                  @RequestBody Product productDetails) {
        Product product = productRepo.findById(productId)
                .orElseThrow(() -> new ResouceNotFoundException("Product not found for this id :: " + productId));
        product.setName(productDetails.getName());
        final Product updatedProduct = productRepo.save(product);
        return ResponseEntity.ok(updatedProduct);

    }

    @DeleteMapping("products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable(value = "id") Integer productId) {
        Product product = productRepo.findById(productId).orElseThrow(
                () -> new ResouceNotFoundException("Product not found::: " + productId));
        productRepo.delete(product);
        return ResponseEntity.ok().build();
    }

}