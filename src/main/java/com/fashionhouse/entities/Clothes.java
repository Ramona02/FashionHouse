package com.fashionhouse.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clothes")
public class Clothes {

    @Id
    @GeneratedValue
    public Long id;

    public String category;
    public String color;
    public String size;
    public Integer quantity;
    public Float price;


    public Clothes() {
    }



    public Clothes(String category, String color, String size, Integer quantity, Float price, Long id) {
        this.category = category;
        this.color = color;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    public Long getId() {
        return id;
    }
}