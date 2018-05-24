package com.expertzlab.Collections.HashMapSample;


import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> carList = new ArrayList();

    public void addCartToProductById(int productId) {
        Product product = getCartProductById(productId);
        addToCart(product);
        //System.out.println(addCartToProductById(productId));

    }

    private Product getCartProductById(int productId) {
        Product product = null;
        List<Product> productsList = new Products().getProductList();
        for (Product prod : productsList) {
            if (product.getProductId() == productId) {
                product = prod;
               // System.out.println("Product"+product);
                break;

            }


        }
        return product;
    }

    public void addToCart(Product product) {
        carList.add(product);
        System.out.println(carList);

    }


    public void removeProductById(int productId) {
        Product prod = getCartProductById(productId);
        carList.remove(prod);
        System.out.println("AFter Removing Product" + carList);
    }


    /*void printCartItems(){
        for(Product prod:carList){
            System.out.println(prod.getProductName());
        }
    }*/

    void printCartItems() {
        for (Product prod : carList) {
            System.out.println(prod.getProductName());
        }
    }
}
