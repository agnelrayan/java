package com.expertzlab.ExceptionHandlingEx;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class ExceptEx6 {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch(NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            throw e; // rethrow the exception
        }
    }
    public static void main(String args[]) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}
