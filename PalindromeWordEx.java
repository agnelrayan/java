/**
 * Created by agnel on 5/31/18.
 */
public class PalindromeWordEx {
    public static void main(String[] args) {
        String str="malayalam";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        if(rev.equals(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
