package com.example.demo.service;

import com.example.demo.Response;
import com.example.demo.model.ProductModel;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<ProductModel> getProducts(){
        return repo.findAll();
    }

    public ProductModel getProductById(int id){
        return repo.findById(id).orElse(new ProductModel());
    }

    public void addProduct(ProductModel product){
        repo.save(product);
    }

    public void updateProduct(int id, ProductModel product){
        repo.save(product);
    }

    public void deleteProduct(int id){
        repo.deleteById(id);
    }
}
