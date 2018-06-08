/**
 * Created by agnel on 6/5/18.
 */
public class Cat implements Animal,Lion {
    @Override
    public void walk() {
        System.out.println("Cat Walks...");
        System.out.println("Name of ParentClass:"+name);
    }

    @Override
    public void talk() {
        System.out.println("Cat Sound...Meow Meow..");

    }

    @Override
    public void eat() {
        System.out.println("Cat Eats....");
    }

    public void run(){
        System.out.println("Cat Runs....");
    }

    @Override
    public void speed() {
        System.out.println("Speed Cat...");
    }
}
