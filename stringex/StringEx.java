package stringex;

/**
 * Created by agnel on 6/6/18.
 */
public class StringEx {
    public static void main(String[] args) {
        String str="100";
        int i=Integer.parseInt(str);
        System.out.println("String+Int:"+(str+100));//100100
        System.out.println("Int+Int:"+(i+100));//200

        int i2=200;
        String str2 = String.valueOf(i2);
        String str3 = Integer.toString(i2);
        System.out.println("Int+INt:"+(i2+100));//300
        System.out.println("String+String"+(str3+"EXP"));//200EXP
    }

}
