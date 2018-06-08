package exceptionex;

import java.io.FileNotFoundException;

/**
 * Created by agnel on 6/7/18.
 */
public class Child extends Parent {
    public void message() throws FileNotFoundException{
        System.out.println("Message in Child...");
        }
        //System.out.println(c);
    }

