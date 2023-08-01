package com.enh.streams.data;

import com.enh.streams.enums.Arrival;
import com.enh.streams.enums.Brand;
import com.enh.streams.enums.PaymentMode;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    private String code;
    private String name;
    private String description;
    private BigDecimal price;
    private List<Product> productReferences;
    private boolean isSellable;
    private Arrival arrival;
    private Brand brand;
    private int sold;
    private int ratings;
    private PaymentMode paymentMode;

    public Product(String code, String name, String description, BigDecimal price, List<Product> productReferences, boolean isSellable, Arrival arrival, Brand brand, int sold, int ratings, PaymentMode paymentMode) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.productReferences = productReferences;
        this.isSellable = isSellable;
        this.arrival = arrival;
        this.brand = brand;
        this.sold = sold;
        this.ratings = ratings;
        this.paymentMode = paymentMode;
    }

    public Product(String code, String name, String description, BigDecimal price, List<Product> productReferences, boolean isSellable, Arrival arrival, Brand brand, int sold) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.productReferences = productReferences;
        this.isSellable = isSellable;
        this.arrival = arrival;
        this.brand = brand;
        this.sold = sold;
    }

    public Product(String code, String name, String description, BigDecimal price, boolean isSellable, Arrival arrival, Brand brand) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isSellable = isSellable;
        this.arrival = arrival;
        this.brand = brand;
    }

    public Product(String code, String name, String description, BigDecimal price, List<Product> productReferences, boolean isSellable, Arrival arrival) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isSellable = isSellable;
        this.arrival = arrival;
    }

    public Product(String code, String name, String description, BigDecimal price, boolean isSellable, Arrival arrival) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isSellable = isSellable;
        this.arrival = arrival;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", productReferences=" + productReferences +
                ", isSellable=" + isSellable +
                ", arrival=" + arrival +
                ", brand=" + brand +
                ", sold=" + sold +
                ", ratings=" + ratings +
                ", paymentMode=" + paymentMode +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Product> getProductReferences() {
        return productReferences;
    }

    public void setProductReferences(List<Product> productReferences) {
        this.productReferences = productReferences;
    }

    public boolean isSellable() {
        return isSellable;
    }

    public void setSellable(boolean sellable) {
        isSellable = sellable;
    }

    public Arrival getArrival() {
        return arrival;
    }

    public void setArrival(Arrival arrival) {
        this.arrival = arrival;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
}
