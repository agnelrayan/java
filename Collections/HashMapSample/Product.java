package com.expertzlab.Collections.HashMapSample;

public class Product {

    Integer productId;
    String productName;
    Double productPrice;
    Integer productUnit;
    Integer productStock;

    public Integer getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(Integer productUnit) {
        this.productUnit = productUnit;
    }




    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productUnit=" + productUnit +
                ", productStock=" + productStock +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (getProductId() != null ? !getProductId().equals(product.getProductId()) : product.getProductId() != null)
            return false;
        if (getProductName() != null ? !getProductName().equals(product.getProductName()) : product.getProductName() != null)
            return false;
        if (getProductUnit() != null ? !getProductUnit().equals(product.getProductUnit()) : product.getProductUnit() != null)
            return false;
        if (getProductPrice() != null ? !getProductPrice().equals(product.getProductPrice()) : product.getProductPrice() != null)
            return false;
        return getProductStock() != null ? getProductStock().equals(product.getProductStock()) : product.getProductStock() == null;

    }

    @Override
    public int hashCode() {
        int result = getProductId() != null ? getProductId().hashCode() : 0;
        result = 31 * result + (getProductName() != null ? getProductName().hashCode() : 0);
        result = 31 * result + (getProductPrice() != null ? getProductPrice().hashCode() : 0);
        result = 31 * result + (getProductUnit() != null ? getProductUnit().hashCode() : 0);
        result = 31 * result + (getProductStock() != null ? getProductStock().hashCode() : 0);
        return result;
    }



    public Product(Integer productId, String productName, Double productPrice, Integer productUnit,Integer productStock) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productUnit=productUnit;
    }

    public Product(Integer productId, String productName,Double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        //this.productStock = productStock;
        //this.productUnit=productUnit;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }


    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }


}
