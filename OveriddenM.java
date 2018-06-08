/**
 * Created by agnel on 6/2/18.
 */
public class OveriddenM {
    public static void main(String[] args) {
        System.out.println("Parent Methods...");
        Parent p = new Parent();
        p.smile();
        p.talk();
        System.out.println();

        System.out.println("Child Methods...");
        Child c = new Child();
        c.smile();
        c.talk();
        c.walk();
        c.greet();
        System.out.println();

        System.out.println("Reference by Parent Class");
        Parent p2 = new Child();
        p2.talk();
        p2.smile();
        p2.greet();
      //  p2.walk();

    }
}
