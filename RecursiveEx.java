/**
 * Created by agnel on 6/2/18.
 */
public class RecursiveEx {
    static int count=0;
    int id;
    public static void message(){
        count++;
        if(count<=5) {
            System.out.println("Hi, Helo...");
            message();
        }

    }
    public static void main(String[] args) {
        RecursiveEx r = new RecursiveEx();
        message();
        System.out.println(count);
        System.out.println(r.id);

    }
}
