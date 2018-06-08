package stringex;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by agnel on 6/6/18.
 */
public class StringEx4 {
    public static void main(String[] args) throws Exception{

        String str3="Welcome Java String";
        byte[] strByte=str3.getBytes();
        //System.out.println(strByte);

        FileOutputStream fout = new FileOutputStream("file");
        fout.write(strByte);
        System.out.println("Success..");

        FileInputStream fin = new FileInputStream("file");
        int i=0;
        while((i=fin.read())!=-1){
            System.out.print((char)i);

        }

            }
}
