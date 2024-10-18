package com.ghostappi.backend.model;

import java.io.Serializable;
import java.util.Objects;



public class SaleProductPK implements Serializable {
    private Sale sale;
    private Product product;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SaleProductPK saleProduct)) return false;
        return product.getIdProduct() == saleProduct.product.getIdProduct() && Objects.equals(sale, saleProduct.sale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sale, product);
    }

    public Sale getSale() {
        return sale;
    }

    public Product getProduct() {
        return product;
    }
}
