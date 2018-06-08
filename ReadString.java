import java.util.Scanner;

/**
 * Created by agnel on 5/31/18.
 */
public class ReadString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = input.nextLine();

        System.out.println("Enter the Character");
        char ch =input.next().charAt(0);
        System.out.println("HI, Welcome Mr/Ms: "+str);
        System.out.println("Character:"+ch);

    }
}
