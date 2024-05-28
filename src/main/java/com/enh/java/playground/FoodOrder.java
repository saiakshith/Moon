package com.enh.java.playground;

import java.math.BigDecimal;

public class FoodOrder {
    public String itemName;
    public BigDecimal itemPrice;
    public int quantity;
    public String deliveryAddress;
    public String specialInstructions;
    public boolean isExpressDelivery;
    public boolean applyDiscount;

    public FoodOrder(String itemName, BigDecimal itemPrice, int quantity, String deliveryAddress, String specialInstructions, boolean isExpressDelivery, boolean applyDiscount) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.deliveryAddress = deliveryAddress;
        this.specialInstructions = specialInstructions;
        this.isExpressDelivery = isExpressDelivery;
        this.applyDiscount = applyDiscount;
    }
}
