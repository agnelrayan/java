package fileex;

import java.io.*;

/**
 * Created by agnel on 6/7/18.
 */
public class FileEx {
    public static void main(String[] args) throws Exception{
        FileOutputStream fin = new FileOutputStream("file1");
        FileOutputStream fin2 = new FileOutputStream("file2");
        FileOutputStream fin3 = new FileOutputStream("file3");
        String str="Reading into Multiple file using BAOS";
        byte[] byteStr=str.getBytes();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(byteStr);

        baos.writeTo(fin);
        baos.writeTo(fin2);
        baos.writeTo(fin3);

        FileInputStream fi = new FileInputStream("file1");
        FileInputStream fi2 = new FileInputStream("file2");

        SequenceInputStream sin = new SequenceInputStream(fi,fi2);
        FileOutputStream fout = new FileOutputStream("sequence");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        int i=0;
        while((i=sin.read())!=-1){
           System.out.print((char)i);
            bout.write(i);
            System.out.println();
        }


        System.out.println("Written Successfully..");
    }
}
