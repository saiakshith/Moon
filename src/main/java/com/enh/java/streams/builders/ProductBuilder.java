package com.enh.java.streams.builders;

import com.enh.java.streams.data.Product;
import com.enh.java.streams.enums.Arrival;
import com.enh.java.streams.enums.Brand;
import com.enh.java.streams.enums.PaymentMode;
import com.enh.java.streams.enums.ProductType;

import java.math.BigDecimal;
import java.util.List;

public class ProductBuilder {
    private static final ProductBuilder self = new ProductBuilder();
    private Product product;
    private ProductBuilder() {}
    
    public static ProductBuilder withCode(final String code) {
        self.product = new Product();
        self.product.setCode(code);
        return self;
    }
    
    public ProductBuilder withName(final String name) {
        self.product.setName(name);
        return self;
    }
    
    public ProductBuilder withDescription(final String description) {
        self.product.setDescription(description);
        return self;
    }
    
    public ProductBuilder withPrice(final BigDecimal price) {
        self.product.setPrice(price);
        return self;
    }

    public ProductBuilder withProductReferences(final List<Product> productReferences) {
        self.product.setProductReferences(productReferences);
        return self;
    }

    public ProductBuilder withSellable(final boolean sellable) {
        self.product.setSellable(sellable);
        return self;
    }

    public ProductBuilder withArrival(final Arrival arrival) {
        self.product.setArrival(arrival);
        return self;
    }
    
    public ProductBuilder withBrand(final Brand brand) {
        self.product.setBrand(brand);
        return self;
    }

    public ProductBuilder withSold(final int sold) {
        self.product.setSold(sold);
        return self;
    }

    public ProductBuilder withRatings(final int ratings) {
        self.product.setRatings(ratings);
        return self;
    }

    public ProductBuilder withPaymentMode(final PaymentMode paymentMode) {
        self.product.setPaymentMode(paymentMode);
        return self;
//        return this; // This is fine as well, but for readability purpose use self.
    }
    
    public ProductBuilder withType(final ProductType type) {
        self.product.setType(type);
        return self;
    }
    
    public Product build() {
        return self.product;
//        return this.product; // This is fine as well, but for readability purpose use self.product.
    }
}
