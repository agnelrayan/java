package com.expertzlab.annotations;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


/**
 * Created by agnel on 6/1/18.
 */
public class MyReflection {
    public static void main(String[] args) throws Exception{
     /*   Class m = MyClass.class;
        Method[] marray=m.getDeclaredMethods();

        for(Method method:marray){
            System.out.println("Methods:"+method.getName());
        }*/

   /* Class oc = OurClass.class;
     Annotation[] array=oc.getDeclaredAnnotations();

     for(Annotation a:array){
         System.out.println("Annotation:"+a.annotationType());
         Field[] fields=a.getClass().getDeclaredMethods();
         for(Field f:fields){
             System.out.println(f.getName());
         }
     }*/

  /* Class oc = OurClass.class;
   Annotation[] aa = oc.getAnnotations();

   for(Annotation a:aa){
       MyAnnotation ma = (MyAnnotation)a;

       System.out.println("Annottotiion:"+a.annotationType());
       System.out.println(""+ma.name());
       System.out.println(""+ma.value());
       System.out.println(""+ma.age());
       System.out.println(""+ma.names().length);
   }*/

  Class oc = OurClass.class;
  Annotation[] ar = oc.getAnnotations();
  for(Annotation a:ar){
     // Maturity ma = (Maturity)a;
      OurClass oc2=(OurClass)oc.newInstance();

      //Adult
      Method[] methods = oc.getMethods();
      for(Method om:methods){

          //Annotation[] ans = om.getAnnotations();


          //System.out.println(om.invoke(oc2,"",""));
          System.out.println(om.getName());
         // System.out.println(om.invoke());

          if(om.getName().equals("adultMethod")||om.getName().equals("kidMethod")) {
              Annotation[] ans = om.getAnnotations();
              Maturity maturity = (Maturity) ans[0];
              if(maturity.age()<18)
                  System.out.println(om.invoke(oc2));


          }   om.invoke(oc2);
      }
  }



    }
}
