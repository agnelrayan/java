package com.expertzlab.sample3.test.test2;

/**
 * Created by agnel on 5/21/18.
 */
public class FactEx {

    public int fact(int x){
        int f=0;
        if(x==1)
            return 1;

        else if(x>1)

            return x* fact(x - 1);
           // return f;

      //  return f;
        return 0;

    }

    public static void main(String[] args) {

        //int val=fact(5);
        FactEx obj = new FactEx();
        int val=obj.fact(5);

        System.out.println("factorial:"+val);


    }
}
