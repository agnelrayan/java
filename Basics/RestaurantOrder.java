package com.expertzlab.Basics;


import java.util.Scanner;

public class RestaurantOrder {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        // title
        System.out.println(" Welcome to Cafe Java!");

        //ask how many people in group
        System.out.println("First tell me how many people are in your group: ");
        int numDiner = input.nextInt();

        //size an array of type String
        String dinerNameArray[] = new String[numDiner];

        //ask for name of each diner and store in dinerArray
        for( int i = 0; i < dinerNameArray.length; i++)
        {
            System.out.print("Enter the name of diner #" + (i+1) + ":");
            dinerNameArray[i] = input.nextLine();
            input.nextLine();
        }//end for


        System.out.println("Now each person will need to order an item from each menu category.");
        System.out.println("I will ask each diner for all their menu selections.");
        input.nextLine();


        for (int i = 0; i < dinerNameArray.length; i++)
        {
            System.out.print(dinerNameArray[i] + ", please make your selections from the following menus:");
            input.nextLine();

            //create array for sub-menus
            String[] appetizerArray = {"No Selection", "Deep Fried Calamari", "Soup du Jour", "Garden Salad", "Garlic Bread"};
            double[] appetizerPriceArray = new double [5];
            appetizerPriceArray [0] = 0.00;
            appetizerPriceArray [1] = 7.50;
            appetizerPriceArray [2] = 4.99;
            appetizerPriceArray [3] = 3.99;
            appetizerPriceArray [4] = 4.50;




            System.out.print("Please select one item from the Appetizer menu.");
            System.out.println();
            System.out.println("1. **No Selection** $0.00");
            System.out.println("2. Deep Fried Calamari $7.50");
            System.out.println("3. Soup du Jour $4.99");
            System.out.println("4. Garden Salad $3.99");
            System.out.println("5. Garlic Bread $4.50");
            System.out.println("Please enter your selection #: ");
            int userInput = input.nextInt();
            appetizerArray = new String[userInput];


            input.nextLine();
            System.out.println("Thank you, " + dinerNameArray[i] + ". Your order consists of:");
            System.out.println(userInput);
            input.nextLine();

        }//end for
    }
    //end main
}
