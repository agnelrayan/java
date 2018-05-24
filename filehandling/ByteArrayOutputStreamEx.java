package com.expertzlab.filehandling;

import java.io.*;

public class ByteArrayOutputStreamEx {
    public static void main(String[] args) throws Exception {

       System.out.println("Byte ArrayOutputStream....");
        FileOutputStream fos = new FileOutputStream("abc123.txt");
        FileOutputStream fos2 = new FileOutputStream("xyz123.txt");
        FileOutputStream fos3 = new FileOutputStream("ijk123.txt");
        FileOutputStream fos4 = new FileOutputStream("lmn123.txt");
        FileOutputStream fos5 = new FileOutputStream("rst123.txt");


        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        String str = "We trust you Lord";
        byte[] byteStr = str.getBytes();

        bos.write(byteStr);

        bos.writeTo(fos);
        bos.writeTo(fos2);
        bos.writeTo(fos3);
        bos.writeTo(fos4);
        bos.writeTo(fos5);
    }
}

        //  bos.flush();
        //bos.close();
        //  fos.close();
        //     fos2.close();
        //   fos3.close();
        /*System.out.println("Completed");
        System.out.println("SequenceInputStreams............");
        System.out.println("--------------------------------");

        FileInputStream fin1 = new FileInputStream("abc123.txt");
        FileInputStream fin2 = new FileInputStream("rst123.txt");
        FileInputStream fin3 = new FileInputStream("a768.txt");

        SequenceInputStream seq = new SequenceInputStream(fin1, fin2);
        int j = 0;
        while ((j = seq.read()) != -1) {
            System.out.print((char) j);
        }
        System.out.println();
    }
}*/
/*
        System.out.println("------------------------------");

        System.out.println("ByteArrayInputStream...........");

        String str2="We are your people";
        byte[] bytes = str2.getBytes();

        byte[] bytes1={65,67,68,97};

        ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
        ByteArrayInputStream bin2 = new ByteArrayInputStream(bytes1);

        int i=0;
        while((i=bin2.read())!=-1){
            System.out.println(i);
        }
    }
}*/
