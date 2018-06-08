package com.expertzlab.Basics;


import java.util.Scanner;

public class Project {
    static int choice;
    static String monthChoice;
    private static final String[] monthsArray = { "", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" };
    public static void main(String[] args) {

        {
            Scanner input = new Scanner(System.in);
            System.out.println("***************Expenditure***************");
            System.out.println("1)Enter monthly expenses");
            System.out.println("2)Display detailed expenditure by month");
            System.out.println("3)Quick glance at monthly expenses");
            System.out.println("4)Exit");
            System.out.println("Please select your choice <1-3>:");
            choice = input.nextInt();


            switch (choice) {
                case 1:
                    int count = 0;
                    //   String[] monthsArray = {"", "Jan", "Feb", "Mar", "Apr", "May","Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
                    System.out.println("*******************************************");
                    System.out.println("\t\t\t\t");
                    System.out.print("Enter month <1 for Jan - 12 for Dec>:");
                    int month = input.nextInt();
                    for (int i=0; i < monthsArray.length; i++){
                        monthChoice = monthsArray[month - 1];
                    }
                    System.out.println("-------------------------------------");
                    System.out.println(monthChoice + "expenditure (max 10 items)");
            }
        }
    }  }