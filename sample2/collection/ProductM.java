package com.expertzlab.sample2.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agnel on 5/18/18.
 */
public class ProductM {
    public static void main(String[] args) {
        ArrayList<Product> pl = new ArrayList();
        pl.add(new Product(1,"Dell",900.10f));
        pl.add(new Product (2,"HP",343.232f));
        pl.add(new Product(3,"Acer",320.32f));

      //  List<Float> pl2 = pl.stream().filter(p ->p.price>500).map(p->p.price).collect().Collectors.toList());
       // System.out.println("Price list:"+pl2);

    }
}
