package com.expertzlab.interfaceex;

/**
 * Created by agnel on 2/28/18.
 */
public class InterfaceMain {
    public static void main(String[] args) {
        Cars obj = new BMW();
        obj.brake();
        obj.clutch();
        obj.drive();
        System.out.println(obj.COMPANY_NAME);
        System.out.println(obj instanceof Cars);
    }
}
