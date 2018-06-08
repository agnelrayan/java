/**
 * Created by agnel on 6/5/18.
 */
public abstract class Vehicle {
    abstract void drive();
    abstract void speed();
    void clutch(){
        System.out.println("Clutch in Vehicle...");
    }
    Vehicle(){
        System.out.println("Vehicle Constructor...");
    }


}
