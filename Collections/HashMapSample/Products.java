package com.expertzlab.Collections.HashMapSample;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private final List<Product> productList = new ArrayList();

    public Products(){
        this.initStoreItems();
    }

    public List<Product> getProductList(){
        return productList;
    }

    public void initStoreItems() {
        String[] productName = {"Lux", "Hamam", "Dove"};
        Double[] productPrice = {25d, 28d, 30d};
        Integer[] productUnit={10,10,10};
        Integer[] productStock = {10, 10, 10};


        for (int i = 0; i < productName.length; i++) {
            this.productList.add(new Product(i + 1, productName[i], productPrice[i],productUnit[i], productStock[i]));
        }

       // System.out.println(productList);
    }
        /*public static void main(String[] a){

        Products obj = new Products();
        obj.initStoreItems();
            obj.getProductList();


    }*/


    }

