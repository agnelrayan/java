package stringex;

/**
 * Created by agnel on 6/6/18.
 */
public class StringEx3 {
    public static void main(String[] args) {
        String str= new String("ExpertZlab");
        str.concat("Technology");
        System.out.println(str);

        StringBuffer sb = new StringBuffer("ExpertZlab");
        sb.append("Technology");
        System.out.println(sb);

        StringBuilder sbu = new StringBuilder("ExpertZlab");
        sbu.append("Technology");
        System.out.println(sbu);
    }
}
