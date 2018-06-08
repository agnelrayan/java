/**
 * Created by agnel on 6/5/18.
 */
public class Dog implements Animal{
    @Override
    public void walk() {
        System.out.println("Dog Walks...");
    }

    @Override
    public void talk() {
        System.out.println("Dog Talks...LOl..Lol..");

    }

    @Override
    public void eat() {
        System.out.println("Dog Eats...");
    }

    void run(){
        System.out.println("Dog Run....");
    }

}
