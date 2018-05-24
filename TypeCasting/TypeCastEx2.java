package com.expertzlab.TypeCasting;

/**
 * Created by geo on 22/9/17.
 */
public class TypeCastEx2 {

        public static void main(String... args) {

            Integer integer = new Integer("Ag");
            Float floatt = new Float(20F);

            //this is not a cast - error
            // integer = floatt; //compiler error - incompatible types
            // integer = (Integer) floatt;//compiler error - inconvertible types

            //upcast - widening conversion
            Object obj = integer; //no explicit cast required
            System.out.println(obj);

            //downcast - narrowing conversion
            Integer in = (Integer)obj;//only subtype
            System.out.println(in);


            //downcast - Object to String
            //runtime issue - instance Object is not of String
            Integer str = (Integer)obj;//ClassCastException
        }
}
