/**
 * Created by agnel on 6/5/18.
 */
public interface AnonymousEx {
    void message();
    default void display(){
        System.out.println("Default Method in Interface...");
    }

    static void printStatic(){

        System.out.println("Static Method in Interface");
    }




}
