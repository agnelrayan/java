/**
 * Created by agnel on 6/5/18.
 */
public class VehicleM {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        System.out.println("Methods in Car");
        c.drive();
        c.gear();
        c.speed();
        c.clutch();
        System.out.println();

        System.out.println("Methods in Bike");
        b.drive();
        b.gear();
        b.speed();
        b.clutch();

        Vehicle v= new Vehicle() {
            @Override
            void drive() {

            }

            @Override
            void speed() {

            }
        };
        v.clutch();
        v.drive();
        v.speed();
    }
}
