/**
 * Created by agnel on 6/5/18.
 */
public class AnimalM {
    public static void main(String[] args) {
        System.out.println("Reference by Animal");
        Animal a = new Cat();
        a.eat();
        a.talk();
        a.walk();

        System.out.println();

        System.out.println("Reference by Animal");
        Animal a2 = new Dog();
        a2.walk();
        a2.talk();
        a2.eat();
        System.out.println();

        Cat c = new Cat();
        c.speed();

        System.out.println("Using Anonymous Class..");

    }
}
