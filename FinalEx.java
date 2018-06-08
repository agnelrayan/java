/**
 * Created by agnel on 6/5/18.
 */
public class FinalEx extends FinalMethod {
    int speed=100;

    public void display(){
        speed=150;
        System.out.println("Speed:"+speed);
    }

    public void message(){
        System.out.println("Message in FinalEx..");
    }

    public static void main(String[] args) {
        FinalEx f = new FinalEx();
        f.display();
        f.message();
    }
}
