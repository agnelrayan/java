/**
 * Created by agnel on 6/5/18.
 */
public class AnonymousM {
    public static void main(String[] args) {
        AnonymousEx a = new AnonymousEx(){
            public void message(){
                System.out.println("Message in Anonymous Interface...");
            }
        };
        a.message();
        a.display();
        AnonymousEx.printStatic();
    }
}
