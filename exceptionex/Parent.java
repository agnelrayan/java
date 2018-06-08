package exceptionex;

import java.io.FileNotFoundException;

/**
 * Created by agnel on 6/7/18.
 */
public class Parent {
    public void message() throws FileNotFoundException{
        System.out.println("Message in Parent...");
    }
    void display(){
        System.out.println("In Parent Display()");
    }

}
