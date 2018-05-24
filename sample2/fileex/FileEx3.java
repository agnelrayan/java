package com.expertzlab.sample2.fileex;

import java.io.File;
import java.io.IOException;

/**
 * Created by agnel on 5/14/18.
 */
public class FileEx3 {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/agnel/output3");
        File[] f = file.listFiles();
        
        for(File fi:f){
            //System.out.println(fi.getName()+"Can Write:"+fi.canWrite()+"File Hidden:"+fi.isHidden()+"Length:"+fi.length());
            System.out.println("Get Absolute Path:"+fi.getAbsoluteFile());
            System.out.println("Get Cannonical Path:"+fi.getCanonicalPath());
        }


    }
}
