package com.expertzlab.arrays;
class Students
        {
        int marks;
        }
public class ArrayOfObjects
{
    public static void main(String args[])
    {
        Students std[] = new Students[3];   // array of reference variables of Student
        // std[0].marks = 40;             // raises compilation error
        std[0] = new Students();           // convert each reference variable into Student object
        std[1] = new Students();
        std[2] = new Students();

        std[0].marks = 40;                // assign marks to each Student element
        std[1].marks = 50;
        std[2].marks = 60;

        System.out.println("\n3 students average marks: " + (std[0].marks+std[1].marks+std[2].marks)/3);

        // Array of objects of Integer
        Integer price[] = new Integer[5];
        int value = 10;
        for(int i = 0; i < price.length; i++)
        {
            price[i] = new Integer(value+=5);
            System.out.print(price[i] + " ");
        }
    }
}
