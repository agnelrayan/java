package com.expertzlab.StaticEx;

class StaticField
{
    static int objectCount = 0;

    public StaticField()
    {
        objectCount++;
    }

    public String toString()
    {
        return new String ("There are " + objectCount + " objects of class " + this.getClass().getName());
    }

    public static String numOfObjects()
    {
        return new String ("There are " + objectCount + " objects of class " + StaticField.class.getName());
    }
}

public class StaticFieldDemo
{
    public static void main(String[] args)
    {
        System.out.println(StaticField.numOfObjects());

        StaticField s1 = new StaticField();
        StaticField s2 = new StaticField();
        StaticField s3 = new StaticField();

        System.out.println(StaticField.numOfObjects());

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
