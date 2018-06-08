package stringex;

/**
 * Created by agnel on 6/6/18.
 */
public class StringEx2 {
    public static void main(String[] args) {
        String str="java";
        String str2="java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str.equals(str2):"+(str.equals(str2)));//true
        System.out.println("(str==str2):"+(str==str2));//true

        System.out.println("str.equals(str3):"+str.equals(str3));//true
        System.out.println("(str==str3) :"+(str==str3));//false
        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

    }
}
