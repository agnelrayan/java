/**
 * Created by agnel on 6/5/18.
 */
public class Bike extends Vehicle {
    @Override
    void drive() {
        System.out.println("Drive in Bike...");
    }

    @Override
    void speed() {
        System.out.println("Speed in Bike...");
    }

    void gear(){
        System.out.println("Gear in Bike...");
    }
}
