package com.expertzlab.RegularEx;

public class SecManTest1 extends SecurityManager {

    public void checkAccess(ThreadGroup threadGroup){
        throw new SecurityException("Not Allowed");

    }
    public static void main(String[] args) {
        System.setProperty("java.security.policy","file:/C:/java.policy");

       // SecurityManager sm = new SecurityManager();

       // System.setSecurityManager(sm);

       // sm.checkAccept("www.tutorialspoint.com",8080);

        System.out.println("Allowed");

       // sm.checkAccess(Thread.currentThread());

        SecManTest1 secManTest1 = new SecManTest1();
        System.setSecurityManager(secManTest1);
        secManTest1.checkAccess(new ThreadGroup("example"));
        secManTest1.checkAwtEventQueueAccess();
        secManTest1.checkConnect("www.google.com",8080);
        secManTest1.checkCreateClassLoader();
        secManTest1.checkDelete("file.txt");
        secManTest1.checkExec("notepad.exe");
        secManTest1.checkExit(3);

        System.out.println("Allowed");


    }
}
