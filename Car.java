/**
 * Created by agnel on 6/5/18.
 */
public class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Drive in Car...");
    }

    @Override
    void speed() {
        System.out.println("Speed in Car...");

    }

    void gear(){
        System.out.println("Gear in Car");
    }
}
