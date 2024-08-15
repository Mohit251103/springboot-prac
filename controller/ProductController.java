package com.example.demo.controller;

import com.example.demo.Response;
import com.example.demo.model.ProductModel;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<ProductModel> products(){
        return productService.getProducts();
    }

    @RequestMapping("/products/{id}")
    public ProductModel getProduct(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public Response addProduct(@RequestBody ProductModel product){
        System.out.println(product);
        productService.addProduct(product);
        return new Response("Product added successfully", 200);
    }

    @PutMapping("/products/{id}")
    public Response updateProduct(@PathVariable int id, @RequestBody ProductModel product){
        productService.updateProduct(id,product);
        return new Response("Updated successfully", 200);
    }

    @DeleteMapping("/products/{id}")
    public Response deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
        return new Response("Deleted successfully", 200);
    }
}
