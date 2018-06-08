import java.util.Random;

/**
 * Created by agnel on 6/4/18.
 */
public class OTPaword {
    public static void main(String[] args) {
        int length=10;
        System.out.println(passwordMethod(length));
    }

    static char[] passwordMethod(int len){

        System.out.println("Generating password using random()....");
        System.out.println("You new Password is:");

        String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small ="abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        
        String val =caps+small+num;

        Random r = new Random();

        char[] password = new char[len];

        for(int i=0;i<len;i++){
            password[i]=val.charAt(r.nextInt(val.length()));
        }
        return password;
    }



}
