package com.expertzlab.annotations;

/**
 * Created by agnel on 6/1/18.
 */

//@MyAnnotation(value="one", name="Ag",age=32,names={"Ag","Ray"})
public class OurClass {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.myMethod1();
    }

    @Maturity(age=19)
    public String adultMethod(){
        return "age > 18";
    }

    @Maturity(age=5)
    public String kidMethod(){
        return "age<18";

    }
}
