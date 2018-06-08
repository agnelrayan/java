//import static java.lang.Math.PI;

import static java.lang.Math.*;
//import static java.lang.Math.max;

/**
 * Created by agnel on 5/31/18.
 */
public class Area {
    public static void main(String[] args) {
        int r=10;
        int a=20;
        int b=30;

        float area = (float) (PI*r*r);
        System.out.println("Area:"+area);
        System.out.println("Maximum:"+max(a,b));
        System.out.println("Minimum:"+Math.min(a,b));
    }
}
