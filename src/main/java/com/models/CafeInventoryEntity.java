package com.models;

import javax.persistence.*;

/**
 * Created by aborn601722 on 5/17/17.
 */
@Entity
@Table(name = "CafeInventory", schema = "JAVACAFE", catalog = "")
public class CafeInventoryEntity {
    private String productName;
    private int price;

    @Id
    @Column(name = "ProductName", nullable = false, length = 80)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "Price", nullable = false)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CafeInventoryEntity that = (CafeInventoryEntity) o;

        if (price != that.price) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productName != null ? productName.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
