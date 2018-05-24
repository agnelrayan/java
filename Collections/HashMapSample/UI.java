package com.expertzlab.Collections.HashMapSample;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UI {
    Cart cartObj = new Cart();
    private int ch = 0;

    public UI() {
        menu();
    }

    public void startScreen() {
        System.out.println("1. Display Store Products");
        System.out.println("2. Dispaly Cart");
        System.out.println("0. Exit");
    }

    public void storeProductMenu() {
        System.out.println("1.Add to Cart");
        System.out.println("2.Remove from Cart");
        System.out.println("0. Exit");
    }

    public void menu() {
        do {
            startScreen();
            getUserInput();

            switch (ch) {
                case 1:
                    displayStoreProducts();
                    storeProductMenu();
                    getUserInput();
                    innerChoice1();
                    break;

                case 2:
                    showCart();
                    break;

                case 3:
                    System.exit(0);
                    break;
                default:
                    break;

            }


        }
        while (ch != 0);
    }

    private void innerChoice1() {

        switch (ch) {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            default:
                break;

        }

    }

    private int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the input");
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }

    private void displayStoreProducts() {
        List<Product> productList = new Products().getProductList();
        for (Product prod : productList) {
            System.out.println(prod.getProductId() + "-" + prod.getProductName() + "-" + prod.getProductPrice() + "-" + prod.productUnit + "-" + prod.getProductStock());

        }
    }

    private void addProductToCart() {
       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter the Proudct Id");
        //Integer productId = input.nextInt();
        System.out.println("Enter the Product Name");
        //String productName = input.nextLine();

        List<Product> productList = new ArrayList<Product>();
       // productList.add(productId);
       // productList.add(productName);
        System.out.println(productList);*/

        Scanner input = new Scanner(System.in);
        List<Product> productList = new ArrayList<Product>();

        System.out.println("Enter the Product Id");
        int productId = input.nextInt();

        System.out.println("Enter the Product Name");
        String productName = input.next();

        System.out.println("Enter the Price");
        double productPrice = input.nextDouble();

        Product product = new Product(productId,productName,productPrice);
        productList.add(product); // Add Object in ArrayList
        System.out.println(productList);

        productId = getUserInput();
        cartObj.addCartToProductById(productId);
        //return productId;

        /*List<Product> productList = new Products().getProductList();
        for(Product prod:productList){
            System.out.println(prod.getProductId()+"-"+prod.getProductName()+"-"+prod.getProductPrice()+"-"+prod.productUnit+"-"+prod.getProductStock());
    }*/

}
    private void showCart(){
        cartObj.printCartItems();
    }

    private void removeProductFromCart(){
        int productId = getUserInput();
        cartObj.removeProductById(productId);
    }
}
