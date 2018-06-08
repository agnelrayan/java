package com.expertzlab.sample2;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by agnel on 5/14/18.
 */
public class CompareEx {

   // static Hashtable ht = new Hashtable();
    static ArrayList<Mine> list = new ArrayList(1000);


    public static void main(String[] args) {

        Mine m1 = null;
        for (int i = 0; i < 10; i++) {

            m1 = new Mine("AB" + i, 20);
            // Mine m2 = new Mine("AB",10);

            //ht.put(m1, m1);
            list.add(m1);
            System.out.println("Hashcode:"+m1.hashCode());
            System.out.println("i:"+i);
            //  ht.put(m2,m2);
        }

        Mine m2 = new Mine("AB9", 20);
        long start = System.currentTimeMillis();

      //  Mine x = (Mine) ht.get(m2);

        for(Mine m:list){
            if(m2.equals(m)){
                break;
            }
        }

        if (m2 == null) {
            System.out.println("Object Not found");
            return;
        }
        long end = System.currentTimeMillis();
       // System.out.printf("start=%d, end = %d",start,end);
        System.out.println("Start:"+start);
        System.out.println("End:"+end);
        System.out.println("Search HashCode"+m2.hashCode());

/*        Mine x= (Mine) ht.get(m1);
        System.out.println("M1 values:"+m1.name+","+m1.age);*/

       /* if(m1.equals(m2))
            System.out.println("They are equal");
        else
            System.out.println("Not Equal");
    }*/

    }

    static class Mine {
        /* @Overridell
         public boolean equals(Object o) {
             if (this == o) return true;
             if (o == null || getClass() != o.getClass()) return false;

             Mine mine = (Mine) o;

             if (age != mine.age) return false;
             return name.equals(mine.name);
         }*/
    /*

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }*/
        @Override
        public boolean equals(Object x) {

            boolean eqFlg = false;

            if (this.name.equals(((Mine) x).name)) {
                eqFlg = true;

            }

            if (eqFlg == true && this.age == ((Mine) x).age) {
                eqFlg = true;
            }
            return eqFlg;

        }

        String name;
        int age;

        public Mine(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int hashCode(){
            return name.hashCode();
        }

    }
}