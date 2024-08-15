package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class ProductModel {
    public int getId() {
        return id;
    }

    @Id
    private int id;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    private String name;
    private int price;

    public ProductModel(){}

    public ProductModel(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

//    public void setId(int id){
//        this.id = id;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setPrice(int price){
//        this.price = price;
//    }


    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
